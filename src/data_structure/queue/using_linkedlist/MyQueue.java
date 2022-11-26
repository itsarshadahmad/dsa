package src.data_structure.queue.using_linkedlist;

import java.util.NoSuchElementException;

public class MyQueue {
    private Node first;
    private Node last;
    public int length;

    public MyQueue() {
        first = null;
        last = null;
        length = 0;
    }

    public String peek() {
        if (length == 0) return null;
        else return first.getValue();
    }

    public void enqueue(String value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
        length++;
    }

    public void dequeue() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        first = first.getNext();
        if (length == 1) {
            last = null;
        }
        length--;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void printQueueItems() {
        Node temp = first;
        System.out.print("[ ");
        for (int i = 0; i < length; i++) {
            System.out.print(temp.getValue() + ", ");
            temp = temp.getNext();
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("Youtube");
        queue.enqueue("Gmail");
        queue.enqueue("Google");
        queue.enqueue("Instagram");
        queue.printQueueItems();
        System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        queue.printQueueItems();
    }
}
