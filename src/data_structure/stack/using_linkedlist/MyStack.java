package data_structure.stack.using_linkedlist;

public class MyStack {
    public int length;
    private Node top;
    private Node bottom;

    public MyStack() {
        top = null;
        bottom = null;
        length = 0;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        if (length == 0) {
            top = newNode;
            bottom = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        length++;
    }

    public void pop() {
        top = top.getNext();
        if (length == 1) {
            bottom = null;
        }
        length--;
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public String peek() {
        if (length == 0) {
            return null;
        }
        return top.getValue();
    }

    public String getLastElement() {
        return bottom.getValue();
    }

    public void printList() {
        if (length == 0) return;
        Node temp = top;
        System.out.print("[ ");
        for (int i = 0; i < length; i++) {
            System.out.print(temp.getValue() + ", ");
            temp = temp.getNext();
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(stack.isEmpty());
        stack.push("Youtube");
        stack.push("Udemy");
        stack.push("Google");
        stack.push("Gmail");
        stack.printList();
        System.out.println("Top: " + stack.peek());
        System.out.println("Bottom: " + stack.getLastElement());
        stack.pop();
        System.out.println();
    }
}
