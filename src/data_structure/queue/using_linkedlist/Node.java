package data_structure.queue.using_linkedlist;

public class Node {
    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
        next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
