package BinarySearchTree;

public class BinarySearchTree {
    Item root;
    String NOT_FOUND_ERROR = "Not found";

    public BinarySearchTree() {
        root = new Item();
    }

    public BinarySearchTree(String key) {
        root = new Item(key);
    }

    public void insert(String key) {
        if (root.key == null) {
            root = new Item(key);
            return;
        }
        insertRec(key, root);
    }

    public Item search(String key) {
        return searchRec(key, root);
    }
    public Item min() {
        Item node = root;
        while (node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    private Item searchRec(String key, Item node) {
        if (node == null) {
            throw new RuntimeException(NOT_FOUND_ERROR);
        }

        if (key.equals(node.key)) {
            return node;
        }

        boolean toLeftChild = key.compareTo(node.key) < 0;
        if (toLeftChild) {
            return searchRec(key, node.leftChild);
        } else {
            return searchRec(key, node.rightChild);
        }
    }

    private void insertRec(String key, Item node) {
        
        if (key.compareTo(node.key) < 0) {
            if (node.leftChild != null) {
                insertRec(key, node.leftChild);
            } else {
                node.leftChild = new Item(key);
                node.leftChild.parent = node;
            }
        }

        if (key.compareTo(node.key) >= 0) {
            if (node.rightChild != null) {
                insertRec(key, node.rightChild);
            } else {
                node.rightChild = new Item(key);
                node.rightChild.parent = node;
            }
        }
    }
}
