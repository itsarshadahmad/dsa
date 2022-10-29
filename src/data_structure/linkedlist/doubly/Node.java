package data_structure.linkedlist.doubly;

public class Node {
    private int value;
    private Node previous;
    private Node next;

    public Node(int value) {
        this.value = value;
        next = null;
        previous = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
