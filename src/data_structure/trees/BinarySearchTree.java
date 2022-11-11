package data_structure.trees;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value, null, null);
            return;
        }

        Node currentNode = root;

        while (true) {
            if (currentNode.getValue() > value) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(new Node(value));
                    return;
                }
                currentNode = currentNode.getLeft();
            } else {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(new Node(value));
                    return;
                }
                currentNode = currentNode.getRight();
            }
        }
    }

    public Node lookup(int value) {
        if (root == null) {
            return null;
        }

        Node currentNode = root;

        while (currentNode != null) {
            if (currentNode.getValue() > value) {
                currentNode = currentNode.getLeft();
            } else if (currentNode.getValue() < value) {
                currentNode = currentNode.getRight();
            } else {
                return currentNode;
            }
        }
        return null;
    }
}
