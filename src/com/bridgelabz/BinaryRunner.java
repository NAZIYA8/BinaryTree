package com.bridgelabz;

public class BinaryRunner {
    public static void main(String[] args) {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();

        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.showOrder();
    }
}
