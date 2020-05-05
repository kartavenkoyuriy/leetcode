package edu.problems.leetcode.n0015;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
//        int[] ints = {-1, 0, 1, 2, -1, 4};
//        System.out.println(new ThreeSum().threeSum(ints));
        System.out.println(-0);
    }

    //N^2
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) return null;
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++){//1st from triple. -2 to give place for 2nd, 3rd
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){//skip duplicates
                int lo = i + 1;//2nd
                int hi = nums.length - 1;//3rd
                int sum = -nums[i];
                while (lo < hi){
                    if (nums[lo] + nums[hi] == sum){
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;//if 2nd among dups - move
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;//if 3rd among dups - move
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] > sum){
                        hi--;
                    } else {
                        lo++;
                    }
                }
            }
        }
        return result;
    }

    //N^4
//    List<List<Integer>> threeSum(int[] nums) {
//        if (nums == null) return null;
//
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                OUTER:
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        for (List<Integer> triple : result) {
//                            if (triple.contains(nums[i]) && triple.contains(nums[j]) && triple.contains(nums[k])) {
//                                continue OUTER;
//                            }
//                        }
//                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    }
//                }
//            }
//        }
//        return result;
//    }
}
