package edu.collections.tree.bfsdfs;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {

    public int val;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }
}

public class FindSum {

    Node root = initialize();
    Node simpleRoot = initializeSimple();

    private Node initializeSimple() {
        Node rootTwo = new Node(2);
        Node one = new Node(1);
        Node three = new Node(3);
        rootTwo.left = one;
        rootTwo.right = three;
        return rootTwo;
    }

    Node initialize() {
        Node rootSix = new Node(6);
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        rootSix.left = two;
        rootSix.right = seven;
        two.left = one;
        two.right = four;
        four.left = three;
        four.right = five;
        seven.right = nine;
        nine.left = eight;

        return rootSix;
    }

    public static void main(String[] args) {
        FindSum test = new FindSum();
        System.out.println(test.findSumBfs(test.simpleRoot));
        System.out.println(test.findSumDfsSimple(test.simpleRoot));
        System.out.println(test.findSumBfs(test.root));
        System.out.println(test.findSumDfsSimple(test.root));
        System.out.println("---");
        System.out.println(test.findSumDfs(test.simpleRoot));
        System.out.println(test.findSumDfs(test.root));
    }

    int findSumBfs(Node node) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        int sum = 0;
        while (q.size() > 0) {
            Node tempNode = q.poll();
            sum += tempNode.val;
            if (tempNode.left != null) {
                q.add(tempNode.left);
            }
            if (tempNode.right != null) {
                q.add(tempNode.right);
            }
        }
        return sum;
    }

    //---start extended(dumber) solution
    private int findSumDfs(Node node) {
        return findSumDfs(node, 0);
    }

    private int findSumDfs(Node node, int sum) {
        if (node == null) {
            return 0;
        }

        int sumAll = node.val;
        sumAll += findSumDfs(node.left, sum);
        return sumAll + findSumDfs(node.right, sum);
    }
    //---end extended(dumber) solution

    private int findSumDfsSimple(Node node) {
        if (node == null) {
            return 0;
        }
        return node.val + findSumDfsSimple(node.left) + findSumDfsSimple(node.right);
    }
}
