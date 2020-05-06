package edu.problems.leetcode.n0101;

import edu.problems.leetcode._collections.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3

But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3

Follow up: Solve it both recursively and iteratively.
 */
public class SymmetricTree {

    //iterative
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true; //why?
        if (root.left == null) return root.right == null;
        if (root.right == null) return root.left == null;

        Deque<TreeNode> leftDek = new LinkedList<>();
        Deque<TreeNode> rightDek = new LinkedList<>();
        leftDek.addLast(root.left);
        rightDek.addLast(root.right);
        while (!leftDek.isEmpty() || !rightDek.isEmpty()){
            TreeNode lp = leftDek.pollFirst();
            TreeNode rp = rightDek.pollFirst();

            if (lp == null && rp == null) continue;
            if ((lp != null && rp == null) || (lp == null && rp != null)) return false;
            if (lp.val != rp.val) return false;

            leftDek.addLast(lp.right);
            leftDek.addLast(lp.left);
            rightDek.addLast(rp.left);
            rightDek.addLast(rp.right);
        }
        return true;
    }
}
