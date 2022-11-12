package data_structure.queue.using_stack;

import java.util.Stack;

public class MyQueue {

    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> helperStack = new Stack<>();

    public void enqueue(int value) {
        stack.push(value);
    }

    public int dequeue() {
        fillHelperStackFromMainStack();
        int value = helperStack.pop();
        fillMainStackFromHelperStack();
        return value;
    }

    public Integer peek() {
        fillHelperStackFromMainStack();
        int value = helperStack.peek();
        fillMainStackFromHelperStack();
        return value;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    private void fillHelperStackFromMainStack() {
        while (!stack.isEmpty()) {
            helperStack.push(stack.pop());
        }
    }

    private void fillMainStackFromHelperStack() {
        while (!helperStack.isEmpty()) {
            stack.push(helperStack.pop());
        }
    }

    public void printQueueItems() {
        if (stack.isEmpty()) return;
        fillHelperStackFromMainStack();
        Object[] queueItems = helperStack.toArray();
        System.out.print("[ ");
        for (Object item : queueItems) {
            System.out.print(item + ", ");
        }
        System.out.println("]");
        fillMainStackFromHelperStack();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        System.out.println(queue.isEmpty());
        queue.enqueue(12);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(9);
        queue.printQueueItems();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.enqueue(44);
        queue.enqueue(85);
        queue.enqueue(16);
        queue.printQueueItems();
    }
}
