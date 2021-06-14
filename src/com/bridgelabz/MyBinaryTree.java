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


