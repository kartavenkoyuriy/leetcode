package edu.problems.leetcode.n0169;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:
Input: [3,2,3]
Output: 3

Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums == null) throw new IllegalArgumentException();
        Map<Integer, Integer> numToCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (numToCount.containsKey(nums[i])){
                numToCount.put(nums[i], numToCount.get(nums[i]) + 1);
            } else {
                numToCount.put(nums[i], 1);
            }
        }
        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (numToCount.get(nums[i]) > numToCount.get(maxNum)){
                maxNum = nums[i];
            }
        }
        return maxNum;
    }
}
