package edu.problems.leetcode.n0111;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minLeft = minDepth(root.left);
        int minRight = minDepth(root.right);
//        if (minLeft == 0 && minRight == 0) {
//            return 1;
//        }
//        if (minLeft == 0) {
//            return minRight + 1;
//        }
//
//        if (minRight == 0) {
//            return minLeft + 1;
//        }
//        return 1 + Math.min(minLeft, minRight);
        return (minLeft == 0 || minRight == 0) ? minLeft + minRight + 1: Math.min(minLeft,minRight) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
