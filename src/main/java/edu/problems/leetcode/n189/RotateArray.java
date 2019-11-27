package edu.problems.leetcode.n189;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nine = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] six = new int[]{1, 2, 3, 4, 5, 6};
        int[] five = new int[]{1, 2, 3, 4, 5};
        int[] four = new int[]{1, 2, 3, 4};
        RotateArray rotateArray = new RotateArray();

        rotateArray.rotate(nine, 3);
        rotateArray.rotate(six, 4);
        rotateArray.rotate(five, 2);
        rotateArray.rotate(four, 2);

        System.out.println(Arrays.toString(nine));
        System.out.println(Arrays.toString(six));
        System.out.println(Arrays.toString(five));
        System.out.println(Arrays.toString(four));
    }

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) return;
        if (k < 1 || k == nums.length) return;

        k %= nums.length;

        reverseArray(nums, 0, nums.length);
        reverseArray(nums, 0, k);
        reverseArray(nums, k, nums.length);
    }

    private void reverseArray(int[] nums, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            int temp = nums[start + i];
            nums[start + i] = nums[end - 1 - i];
            nums[end - 1 - i] = temp;
        }
    }
}
