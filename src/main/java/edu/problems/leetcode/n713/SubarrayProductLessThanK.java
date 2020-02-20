package edu.problems.leetcode.n713;

/*
Your are given an array of positive integers nums.

Count and print the number of (contiguous) subarrays where the product of all the elements in the subarray is less than k.

Example 1:

Input: nums = [10, 5, 2, 6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

Note:
0 < nums.length <= 50000.
0 < nums[i] < 1000.
0 <= k < 10^6.
 */

/*
#1 Brute force N^2
0. count = 0
1. outer loop i
1.1. if i < k -> count ++
1.2. multiply = i
1.3. inner loop j
1.3.1. multiply *= j
1.3.2. if multiply < k -> count++
1.3.3. else break
2. return count
*/

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 5, 2, 6};
        int k = 100;
        System.out.println(8 + "|" + new SubarrayProductLessThanK().numSubarrayProductLessThanK(nums, k));

        nums = new int[]{2, 3, 2, 3};
        k = 100;

    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<2) return 0;
        int left = 0;
        int right = 0;
        int multiply = 1;
        int count  = 0;
        while (right< nums.length){
            multiply *= nums[right];
            while (multiply >= k){
                multiply /= nums[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }

    //O(N^2) - slow
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] < k) count++;
//            int multiply = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                multiply *= nums[j];
//                if (multiply < k) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
//        }
//        return count;
//    }
}
