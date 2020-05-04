package edu.problems.leetcode.n0015;


import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
//        int[] ints = {-1, 0, 1, 2, -1, 4};
//        System.out.println(new ThreeSum().threeSum(ints));
        System.out.println(-0);
    }

    List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) return null;

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                OUTER:
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        for (List<Integer> triple : result) {
                            if (triple.contains(nums[i]) && triple.contains(nums[j]) && triple.contains(nums[k])) {
                                continue OUTER;
                            }
                        }
                        List<Integer> newTriple = new ArrayList<>();
                        newTriple.add(nums[i]);
                        newTriple.add(nums[j]);
                        newTriple.add(nums[k]);
                        result.add(newTriple);
                    }
                }
            }
        }
        return result;
    }
}
