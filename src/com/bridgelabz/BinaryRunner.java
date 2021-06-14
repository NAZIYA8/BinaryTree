package com.bridgelabz;

public class BinaryRunner {
    public static void main(String[] args) {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();

        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(65);
        binaryTree.add(11);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);
        int size = binaryTree.getSize();
        System.out.println("Size of the binary tree is :" + size);
        MyBinaryNode<Integer> Search = binaryTree.search(63);
        if (Search == null) {
            System.out.println("Search key not found");
        } else {
            System.out.println("Search key found.\nSearch Key = " + Search.getKey());
        }
    }
}
