package edu.problems.leetcode.n0136;

import java.util.HashSet;
import java.util.Set;
/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int bitXor = 0;
        for (int i = 0; i < nums.length; i++) {
            bitXor ^= nums[i];
        }
        return bitXor;
    }

    private static int singleNumberOldAdditionalSpace(int[] nums) {
        Set<Integer> storeNonDuplicates = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (storeNonDuplicates.contains(nums[i])) {
                storeNonDuplicates.remove(nums[i]);
            } else {
                storeNonDuplicates.add(nums[i]);
            }
        }
        return storeNonDuplicates.iterator().next();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        int[] nums1 = new int[]{4,2,1,2,1};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums1));
    }
}
