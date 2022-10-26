package data_structure.hash_tables;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable {
    // Arraylist of type KeyValue gives structure and inherit its nature in MyNodes class.
    private static class MyNodes extends ArrayList<KeyValue> {
    }

    private final int length;
    private final MyNodes[] data;

    public MyHashTable(int size) {
        length = size;
        data = new MyNodes[length];
    }

    public void set(String key, int value) {
        int address = hash(key);
        if (data[address] == null) {
            data[address] = new MyNodes();
        }
        data[address].add(new KeyValue(key, value));
    }

    public int get(String key) {
        int address = hash(key);
        if (data[address] == null) {
            return 0;
        }
        for (KeyValue node : data[address]) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return 0;
    }

    public List<String> keys() {
        List<String> keys = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (data[i] != null) {
                for (int j = 0; j < data[i].size(); j++) {
                    // data store format => [ [ [key, value] ] ]
                    keys.add(data[i].get(j).getKey());
                }
            }
        }
        return keys;
    }

    public List<Integer> values() {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (data[i] != null) {
                for (int j = 0; j < data[i].size(); j++) {
                    // data store format => [ [ [key, value] ] ]
                    values.add(data[i].get(j).getValue());
                }
            }
        }
        return values;
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % length;
        }
        return hash;
    }

    public static void main(String[] args) {
        MyHashTable table = new MyHashTable(5);
        table.set("pineapple", 1000);
        table.set("orange", 589);
        table.set("grape", 10);
        table.set("apple", 102);
        table.set("banana", 101);
        System.out.println(table.keys().size());
        System.out.println(table.get("pineapple"));
        System.out.println(table.get("orange"));
        System.out.println(table.get("grape"));
        System.out.println(table.get("apple"));
        System.out.println(table.get("banana"));
        System.out.println(table.keys());
        System.out.println(table.values());
    }
}