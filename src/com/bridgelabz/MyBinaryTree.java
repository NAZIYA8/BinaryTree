package com.bridgelabz;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    /**
     * This method is used to add elements recursively
     *
     * @param current it is current node
     * @param key     element passed
     * @return
     */
    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) {
            return current;
        }
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    /**
     * This method is used to get the size of the tree
     *
     * @param current node
     * @return size of the tree
     */
    private int getSizeRecursive(MyBinaryNode<K> current) {
        if (current == null) {
            return 0;
        }
        return 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    /**
     * This method is used to search the entered element if it is present in the tree or not
     *
     * @param current node
     * @param key     is the element passed to search in the tree.
     * @return
     */
    private MyBinaryNode<K> searchRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return null;
        int compareResult = key.compareTo(current.key);

        if (compareResult == 0) {
            return current;
        }
        if (compareResult < 0) {
            return searchRecursively(current.left, key);
        } else {
            return searchRecursively(current.right, key);
        }
    }

    public MyBinaryNode<K> search(K key) {
        return searchRecursively(root, key);
    }


    /**
     * This method helps to show order of the elements passed.
     *
     * @param root root node of the tree to be traversed.
     */
    public void orderHelper(MyBinaryNode<K> root) {
        if (root != null) {
            orderHelper(root.left); // left sub tree
            System.out.println(root.key); // root
            orderHelper(root.right); // right sub tree
        }
    }

    public void showOrder() {
        orderHelper(root);
    }
}


