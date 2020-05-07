package edu.problems.leetcode.n0993;

import edu.problems.leetcode._collections.TreeNode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CousinsInBinaryTree {

    //iterative
    public boolean isCousins(TreeNode root, int x, int y) {
        if (x == y) return false;
        if (root == null) return false;
        Map<Integer, Integer> valToDepth = new HashMap<>();
        Deque<TreeNode> dek = new LinkedList<>();
        valToDepth.put(root.val, 0);
        dek.addLast(root);
        int xParVal = 0;
        int yParVal = 0;
        while (!dek.isEmpty()){
            TreeNode curr = dek.pollFirst();
            if (curr.left != null){
                if (curr.left.val == x) xParVal = curr.val;
                if (curr.left.val == y) yParVal = curr.val;
                dek.addLast(curr.left);
                valToDepth.put(curr.left.val, valToDepth.get(curr.val) + 1);
            }
            if (curr.right != null){
                if (curr.right.val == x) xParVal = curr.val;
                if (curr.right.val == y) yParVal = curr.val;
                dek.addLast(curr.right);
                valToDepth.put(curr.right.val, valToDepth.get(curr.val) + 1);
            }
        }
        return (xParVal != yParVal) && valToDepth.get(x).equals(valToDepth.get(y));
    }
}
