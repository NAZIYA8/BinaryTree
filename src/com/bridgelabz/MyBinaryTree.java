package com.bridgelabz;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    /**
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


