package src.data_structure.stack.using_array;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> array;

    public MyStack() {
        array = new ArrayList<>();
    }

    public void push(String value) {
        array.add(value);
    }

    public void pop() {
        array.remove(array.size() - 1);
    }

    public String peek() {
        if (array.size() == 0) {
            return null;
        }
        return array.get(array.size() - 1);
    }

    public void printStackItems() {
        System.out.print("[ ");
        for (String item : array) {
            System.out.print(item + ", ");
        }
        System.out.println("]");
    }

    public boolean isEmpty() {
        return (array.size() == 0);
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println("isEmpty: " + stack.isEmpty());
        stack.push("Udemy");
        stack.push("Youtube");
        stack.push("Twitter");
        stack.push("Indeed");
        System.out.println("Top: " + stack.peek());
        stack.printStackItems();
        stack.pop();
        stack.pop();
        System.out.println("Top: " + stack.peek());
        stack.printStackItems();
    }
}
