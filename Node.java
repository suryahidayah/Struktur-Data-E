package Modul5;

import java.sql.Struct;
import java.util.Scanner;
import static java.lang.Math.max;

class Node {
    String data;
    Node left, right;

    Node(String item){
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree(){
        root = null;
    }

    void insert(String data){
        root = insertNode(root, data);
    }

    Node insertNode(Node root, String data){
        if (root == null){
            root = new Node(data);
            return root;
        }
        if (data.compareTo(root.data) < 0){
            root.left = insertNode(root.left, data);
        }else {
            root.right = insertNode(root.right, data);
        }

        return  root;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    void preOrder(Node node){
        if(node != null){
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data + " ");
        }
    }

    void drawTree(Node node, String prefix, boolean isLeft){
        if (node != null){
            drawTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
            System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.data);
            drawTree(node.left, prefix + (isLeft ? "    " : "│   "), true);
        }
    }

    void printTree(){
        drawTree(root," ", true);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Kombinasi Elemen (Pisahkan Dengan Spasi) : ");
        String inputCombination = scanner.nextLine();
        String[] elements = inputCombination.split(" ");

        BinaryTree binaryTree = new BinaryTree();
        for (String element : elements){
            binaryTree.insert(element);
        }

        System.out.println("\nBinary Tree : ");
        binaryTree.printTree();

        System.out.println("\nPre-order : ");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\nIn-Order : ");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("\nPost-Order : ");
        binaryTree.postOrder(binaryTree.root);
    }
}