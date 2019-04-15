package edu.collections.tree.bfsdfs;

import java.util.ArrayList;
import java.util.List;

public class NotBinaryTreeSum {

    private static class TNode{
        public int value;
        public List<TNode> subNodes;

        public TNode(int value) {
            this.value = value;
        }

        public TNode(int value, List<TNode> subNodes) {
            this.value = value;
            this.subNodes = subNodes;
        }
    }

    public static int sumAllNodes(TNode node){
        if (node.subNodes == null){
            return node.value;
        }

        int sum = node.value;
        for (TNode subNode : node.subNodes) {
            sum += sumAllNodes(subNode);
        }
        return sum;
    }

    public static void main(String[] args) {
        TNode one = new TNode(1);
        TNode two = new TNode(2);
        TNode three = new TNode(3);
        TNode four = new TNode(4);
        TNode five = new TNode(5);
        TNode six = new TNode(6);

        List<TNode> threeNodes = new ArrayList<>();
        threeNodes.add(two);
        threeNodes.add(four);
        threeNodes.add(six);
        three.subNodes = threeNodes;

        List<TNode> fourNodes = new ArrayList<>();
        fourNodes.add(one);
        fourNodes.add(five);
        four.subNodes = fourNodes;

        System.out.println(sumAllNodes(three));
    }
}
