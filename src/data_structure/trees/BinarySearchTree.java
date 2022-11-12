package data_structure.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    enum SearchType {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
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

    public boolean lookup(int value) {
        if (root == null) {
            return false;
        }

        Node currentNode = root;

        while (currentNode != null) {
            if (currentNode.getValue() > value) {
                currentNode = currentNode.getLeft();
            } else if (currentNode.getValue() < value) {
                currentNode = currentNode.getRight();
            } else {
                return true;
            }
        }
        return false;
    }

    public void remove(int value) {
        if (root == null) {
            return;
        }

        Node currentNode = root;
        Node parentNode = null;

        // Searching for the node to remove and it's parent
        while (currentNode.getValue() != value) {
            parentNode = currentNode;
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
            } else if (value > currentNode.getValue()) {
                currentNode = currentNode.getRight();
            }
        }

        Node replacementNode = null;

        if (currentNode.getRight() != null) { // We have a right node
            replacementNode = currentNode.getRight();
            if (replacementNode.getLeft() == null) { // We don't have a left node
                replacementNode.setLeft(currentNode.getLeft());
            } else { // We have a have a left node, lets find the leftmost
                Node replacementParentNode = currentNode;
                while (replacementNode.getLeft() != null) {
                    replacementParentNode = replacementNode;
                    replacementNode = replacementNode.getLeft();
                }
                replacementParentNode.setLeft(null);
                replacementNode.setLeft(currentNode.getLeft());
                replacementNode.setRight(currentNode.getRight());
            }
        } else if (currentNode.getLeft() != null) {// We only have a left node
            replacementNode = currentNode.getLeft();
        }

        if (parentNode == null) {
            root = replacementNode;
        } else if (parentNode.getLeft() == currentNode) { // We are a left child
            parentNode.setLeft(replacementNode);
        } else { // We are a right child
            parentNode.setRight(replacementNode);
        }
    }

    // void remove(int value) {
    // if (root == null) {
    // return;
    // }
    // Node currentNode = root;
    // Node parentNode = null;
    // while (currentNode != null) {
    // if (value < currentNode.getValue()) {
    // parentNode = currentNode;
    // currentNode = currentNode.getLeft();
    // } else if (value > currentNode.getValue()) {
    // parentNode = currentNode;
    // currentNode = currentNode.getRight();
    // } else if (currentNode.getValue() == value) {
    // // We have a match, get to work!

    // // Option 1: No right child:
    // if (currentNode.getRight() == null) {
    // if (parentNode == null) {
    // this.root = currentNode.getLeft();
    // } else {

    // // if parent > current value, make current left child a child of parent
    // if (currentNode.getValue() < parentNode.getValue()) {
    // parentNode.setLeft(currentNode.getLeft());

    // // if parent < current value, make left child a right child of parent
    // } else if (currentNode.getValue() > parentNode.getValue()) {
    // parentNode.setRight(currentNode.getLeft());
    // }
    // }

    // // Option 2: Right child which doesnt have a left child
    // } else if (currentNode.getRight().getLeft() == null) {
    // currentNode.getRight().setLeft(currentNode.getLeft());
    // if (parentNode == null) {
    // this.root = currentNode.getRight();
    // } else {

    // // if parent > current, make right child of the left the parent
    // if (currentNode.getValue() < parentNode.getValue()) {
    // parentNode.setLeft(currentNode.getRight());

    // // if parent < current, make right child a right child of the parent
    // } else if (currentNode.getValue() > parentNode.getValue()) {
    // parentNode.setRight(currentNode.getRight());
    // }
    // }

    // // Option 3: Right child that has a left child
    // } else {

    // // find the Right child's left most child
    // Node leftmost = currentNode.getRight().getLeft();
    // Node leftmostParent = currentNode.getRight();
    // while (leftmost.getLeft() != null) {
    // leftmostParent = leftmost;
    // leftmost = leftmost.getLeft();
    // }

    // // Parent's left subtree is now leftmost's right subtree
    // leftmostParent.setLeft(leftmost.getRight());
    // leftmost.setLeft(currentNode.getLeft());
    // leftmost.setRight(currentNode.getRight());

    // if (parentNode == null) {
    // root = leftmost;
    // } else {
    // if (currentNode.getValue() < parentNode.getValue()) {
    // parentNode.setLeft(leftmost);
    // } else if (currentNode.getValue() > parentNode.getValue()) {
    // parentNode.setRight(leftmost);
    // }
    // }
    // }
    // return;
    // }
    // }
    // }

    public List<Integer> breathFirstSearchIteratively() {
        Node currentNode = root;
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            list.add(currentNode.getValue());
            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        return list;
    }

    public List<Integer> breathFirstSearchRecursively() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        return breathFirstSearchRecursively(queue, new ArrayList<>());
    }

    public List<Integer> depthFirstSearchInOder(SearchType searchType) {
        return depthFirstSearchInOder(root, new ArrayList<>(), searchType);
    }

    private List<Integer> depthFirstSearchInOder(Node node, ArrayList<Integer> list, SearchType searchType) {
        if (searchType == SearchType.PRE_ORDER)
            list.add(node.getValue());
        if (node.getLeft() != null) {
            depthFirstSearchInOder(node.getLeft(), list, searchType);
        }
        if (searchType == SearchType.IN_ORDER)
            list.add(node.getValue());
        if (node.getRight() != null) {
            depthFirstSearchInOder(node.getRight(), list, searchType);
        }
        if (searchType == SearchType.POST_ORDER)
            list.add(node.getValue());
        return list;
    }

    private List<Integer> breathFirstSearchRecursively(Queue<Node> queue, List<Integer> list) {
        if (queue.isEmpty()) {
            return list;
        }
        Node currentNode = queue.poll();
        list.add(currentNode.getValue());
        if (currentNode.getLeft() != null) {
            queue.add(currentNode.getLeft());
        }

        if (currentNode.getRight() != null) {
            queue.add(currentNode.getRight());
        }
        return breathFirstSearchRecursively(queue, list);
    }

    int count = 0;

    public void printTree() {
        count = 0;
        printTree(root);
    }

    private void printTree(Node node) {
        System.out.print(node.getValue());
        System.out.println();
        count++;
        if (node.getLeft() != null) {
            System.out.print("\t".repeat(Math.max(0, count)) + "Left: ");
            printTree(node.getLeft());
        }
        if (node.getRight() != null) {
            System.out.print("\t".repeat(Math.max(0, count)) + "Right: ");
            printTree(node.getRight());
        }
        count--;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(20);
        tree.insert(1);
        tree.insert(6);
        tree.insert(15);
        tree.insert(170);
        tree.printTree();
        System.out.println(tree.lookup(20));
        tree.remove(20);
        tree.remove(4);
        System.out.println(tree.lookup(20));
        tree.printTree();
        tree.insert(20);
        tree.insert(18);
        tree.insert(10);
        tree.printTree();
        tree.remove(170);
        tree.printTree();
        System.out.println("Breath first search " +
                tree.breathFirstSearchIteratively());
        System.out.println("Depth first search - in order " +
                tree.depthFirstSearchInOder(SearchType.IN_ORDER));
        System.out.println("Depth first search - pre order " +
                tree.depthFirstSearchInOder(SearchType.PRE_ORDER));
        System.out.println("Depth first search - post order " +
                tree.depthFirstSearchInOder(SearchType.POST_ORDER));
    }
}
