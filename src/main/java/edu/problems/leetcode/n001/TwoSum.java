package edu.problems.leetcode.n001;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
//        Given nums = [2, 7, 11, 15], target = 9,
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("[0, 1]|" + Arrays.toString(new TwoSum().twoSum(nums, target)));

        nums = new int[]{4,2,4};
        target = 8;
        System.out.println("[0, 2]|" + Arrays.toString(new TwoSum().twoSum(nums, target)));

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (valToIndex.containsKey(diff)) {
                return new int[]{valToIndex.get(diff), i};
            } else {
                valToIndex.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("Can't find pair");
    }
}
