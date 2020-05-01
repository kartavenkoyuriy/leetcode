package edu.problems.leetcode.n0349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();

//        int[] nums1 = new int[]{1,2,2,3};
//        int[] nums2 = new int[]{2,2};
//        System.out.println(Arrays.toString(i.intersection(nums1, nums2)));


        int[] nums1 = new int[]{9,4,9,8,4};
        int[] nums2 = new int[]{9,4,5};
        System.out.println(Arrays.toString(i.intersection(nums1, nums2)));


    }

    public int[] intersection (int[] nums1, int[] nums2){
        if (nums1 == null || nums2 == null) return null;
        if (nums1.length == 0 || nums2.length == 0) return new int[]{};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for (Integer u : set1) {
            result[i++] = u;
        }
        return result;
    }

}
