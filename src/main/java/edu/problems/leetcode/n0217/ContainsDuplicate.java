package edu.problems.leetcode.n0217;

import java.util.HashSet;

/*
Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true

Example 2:
Input: [1,2,3,4]
Output: false

Example 3:
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate instance = new ContainsDuplicate();
        System.out.println("should be | actual result");
        System.out.println("true|" + instance.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println("false|" + instance.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println("true|" + instance.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    //was forced to removed
    // || nums.length == 0
    //since [] was considered as valid input and false in result
    public boolean containsDuplicate(int[] nums) {
        if(nums == null) throw new IllegalArgumentException();
        HashSet<Integer> uniq = new HashSet<>();
        for (int num : nums) {
            if (uniq.contains(num)) {
                return true;
            }
            uniq.add(num);
        }
        return false;
    }
}
