package arrays;

import java.util.Arrays;

public class DynamicArray {
    private Object[] data;
    private int capacity;
    public int length;

    DynamicArray() {
        data = new Object[1];
        capacity = 1;
        length = 0;
    }

    public Object get(int index) {
        return data[index];
    }

    public void push(Object item) {
        if (capacity == length) {
//        When length of array gets full reassign values of array by increasing size
//        of array twice.
            data = Arrays.copyOf(data, capacity * 2);
            capacity *= 2;
        }
        data[length] = item;
        length++;
    }

    public Object pop() {
        Object itemToRemove = data[length - 1];
        data[length - 1] = null;
        length--;
        return itemToRemove;
    }

    public Object delete(int index) {
        Object deletedItem = data[index];
        shiftItems(index);
        return deletedItem;
    }

    private void shiftItems(int index) {
        for (int i = index; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[length - 1] = null;
        length--;
    }
}

class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        for (int i = 1; i <= 10; i++) {
            array.push(11 * i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array.get(i) + " | ");
        }
        System.out.println();

        System.out.println(array.get(5));
        array.pop();
        array.push(44);
        array.delete(3);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array.get(i) + " | ");
        }
        System.out.println();
    }
}