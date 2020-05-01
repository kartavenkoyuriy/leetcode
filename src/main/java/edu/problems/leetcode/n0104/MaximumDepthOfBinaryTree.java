package edu.problems.leetcode.n0104;

/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Note: A leaf is a node with no children.
Example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 */
public class MaximumDepthOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//    public static int maxDepth(TreeNode root) {
//        return maxDepth(root, 1);
//    }
//
//    private static int maxDepth(TreeNode root, int i) {
//        if (root == null){
//            return i - 1;
//        }
//        int left = maxDepth(root.left, i + 1);
//        int right = maxDepth(root.right, i + 1);
//        return Math.max(left, right);
//    }

    public static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);
        n2.right = new TreeNode(3);
        TreeNode n4 = new TreeNode(1);
        n4.right = new TreeNode(4);
        n4.right.left = new TreeNode(5);
        n4.right.left.right = new TreeNode(7);

        System.out.println(maxDepth(n1));
        System.out.println(maxDepth(n2));
        System.out.println(maxDepth(n4));

    }
}
