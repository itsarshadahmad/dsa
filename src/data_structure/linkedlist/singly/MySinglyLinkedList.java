package src.data_structure.linkedlist.singly;

public class MySinglyLinkedList {
    private Node head;
    private Node tail;
    public int length;

    public MySinglyLinkedList(int value) {
        head = new Node(value);
        tail = head;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        tail.setNext(newNode);
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
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
            Node nextNodeToLeader = leaderNode.getNext();
            newNode.setNext(nextNodeToLeader);
            leaderNode.setNext(newNode);
        }
        length++;
    }

    public void remove(int index) {
        Node leaderNode = traverseToIndex(index - 1);
        Node unwantedNode = leaderNode.getNext();
        leaderNode.setNext(unwantedNode.getNext());
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

    public void reverse() {
        if (head.getNext() == null) return;
        Node first = head;
        tail = head;
        Node second = first.getNext();
        for (int i = 0; i < length - 1; i++) {
            Node temp = second.getNext();
            second.setNext(first);
            first = second;
            second = temp;
        }
        head.setNext(null);
        head = first;
    }

    public static void main(String[] args) {
        MySinglyLinkedList linkedList = new MySinglyLinkedList(10);
        linkedList.append(32);
        linkedList.prepend(12);
        linkedList.insert(1, 3);
        linkedList.insert(3, 55);
        System.out.println(linkedList.length);
        linkedList.printListItems();
        linkedList.remove(1);
        linkedList.reverse();
        System.out.println(linkedList.length);
        linkedList.printListItems();
    }
}
