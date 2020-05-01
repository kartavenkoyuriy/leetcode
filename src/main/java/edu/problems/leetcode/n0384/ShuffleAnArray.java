package edu.problems.leetcode.n0384;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ShuffleAnArray {

    int[] nums;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
//        return accepted01();
        return null;
    }

    private int[] accepted01() {
        Set<Integer> indexes = new HashSet<>();
        int[] shuffled = new int[nums.length];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            int randomIndex = random.nextInt(nums.length);
            while (indexes.contains(randomIndex)){
                randomIndex = random.nextInt(nums.length);
            }
            shuffled[randomIndex] = nums[i];
            indexes.add(randomIndex);
        }

        return shuffled;
    }

    public static void main(String[] args) {
        int[] s3 = new int[]{1,2,3};
        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(s3);
        for (int i = 0; i < 100; i++) {
            System.out.println(Arrays.toString(shuffleAnArray.shuffle()));
        }
    }
}
