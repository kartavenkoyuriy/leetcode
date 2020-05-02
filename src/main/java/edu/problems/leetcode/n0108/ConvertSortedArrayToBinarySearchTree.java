package edu.problems.leetcode.n0108;
/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:
Given the sorted array: [-10,-3,0,5,9],
One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
      0
     / \
   -3   9
   /   /
 -10  5
 */

import edu.problems.leetcode._collections.TreeNode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {

        int[] arr = new int[]{-10, -3, 0, 5, 9};
        TreeNode treeNode = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(arr);
        System.out.println(treeNode);
    }

    //recursive solution
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if (nums == null || nums.length == 0) return null;
//        if (nums.length == 1) return new TreeNode(nums[0]);
//        TreeNode root = new TreeNode(nums[nums.length / 2]);
//        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
//        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
//        return root;
//    }

    // iterative solution
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        Deque<TreeNode> nodes = new LinkedList<>();
        Deque<Integer> leftBorder = new LinkedList<>();
        Deque<Integer> rightBorder = new LinkedList<>();
        TreeNode root = new TreeNode(0); // stub value until assign
        nodes.addLast(root);
        leftBorder.addLast(0);
        rightBorder.addLast(nums.length - 1);
        while (!nodes.isEmpty()){
            TreeNode curr = nodes.pollFirst();
            int lo = leftBorder.pollFirst();
            int hi = rightBorder.pollFirst();
            int mid = lo + (hi - lo) / 2;
            curr.val = nums[mid]; // assign
            if (lo < mid){
                TreeNode left = new TreeNode(0);
                curr.left = left;
                nodes.addLast(left);
                leftBorder.addLast(lo);
                rightBorder.addLast(mid - 1);
            }
            if (hi > mid) {
                TreeNode right = new TreeNode(0);
                curr.right = right;
                nodes.addLast(right);
                leftBorder.addLast(mid + 1);
                rightBorder.addLast(hi);
            }
        }
        return root;
    }
}
