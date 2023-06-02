package data_structure.linkedlist.doubly;

public class MyDoublyLinkedList {
    public int length;
    private Node head;
    private Node tail;

    public MyDoublyLinkedList(int value) {
        head = new Node(value);
        tail = head;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        newNode.setPrevious(tail);
        tail.setNext(newNode);
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        head.setPrevious(newNode);
        newNode.setNext(head);
        head = newNode;
        length++;
    }

    public void insert(int index, int value) {
        if (index >= length) {
            append(value);
        } else {
            Node newNode = new Node(value);
            Node leaderNode = traverseToIndex(index - 1);
            Node followerNode = leaderNode.getNext();
            newNode.setPrevious(leaderNode);
            followerNode.setPrevious(newNode);
            newNode.setNext(followerNode);
            leaderNode.setNext(newNode);
        }
        length++;
    }

    public void remove(int index) {
        Node leaderNode = traverseToIndex(index - 1);
        Node unwantedNode = leaderNode.getNext();
        leaderNode.setNext(unwantedNode.getNext());
        unwantedNode.getNext().setPrevious(leaderNode);
        length--;
    }

    public Node traverseToIndex(int index) {
        Node currentNode = head;
        int counter = 0;
        while (counter != index) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return currentNode;
    }

    public void printListItems() {
        if (head == null)
            return;
        Node currentNode = head;
        System.out.print("[ ");
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + ", ");
            currentNode = currentNode.getNext();
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MyDoublyLinkedList linkedList = new MyDoublyLinkedList(10);
        linkedList.append(32);
        linkedList.append(12);
        linkedList.prepend(4);
        linkedList.insert(1, 3);
        linkedList.insert(3, 55);
        linkedList.remove(1);
        System.out.println("Length: " + linkedList.length);
        linkedList.printListItems();
    }
}
