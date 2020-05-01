package edu.problems.leetcode.n0088;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray m = new MergeSortedArray();

//        int[] nums1 = new int[]{1,5,0,0,0};
//        int[] nums2 = new int[]{2,3,4};
//        m.merge(nums1, 2, nums2, 3);

//        int[] nums1 = new int[]{0,0};
//        int[] nums2 = new int[]{1};
//        m.merge(nums1, 1, nums2, 1);

//        int[] nums1 = new int[]{2, 3, 0, 0, 0};
//        int[] nums2 = new int[]{1, 4};
//        m.merge(nums1, 2, nums2, 2);

//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int[] nums2 = new int[]{2,5,6};
//        m.merge(nums1, 3, nums2, 3);

        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};
        m.merge(nums1, 3, nums2, 3);

//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int[] nums2 = new int[]{4,5,6};
//        m.merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null || m < 0 || n < 0) return; //or throw IAE
        if (n > nums2.length || n + m > nums1.length) return; //or throw IAE

        int i1 = m - 1;
        int i2 = n - 1;
        int curr = n + m - 1;

        while (i1 >= 0 && i2 >= 0) {
            if (nums1[i1] > nums2[i2]) {
                nums1[curr--] = nums1[i1--];
            } else {
                nums1[curr--] = nums2[i2--];
            }
        }

        while (i2 >= 0) {
            nums1[curr--] = nums2[i2--];
        }
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n){
//        if (nums1 == null || nums2 == null || m < 0 || n < 0) return; //or throw IAE
//        int i1 = 0;
//        int i2 = 0;
//        while (i2 < n && i1 < m + n) {
//            if (nums1[i1] <= nums2[i2] && (i1 + 1 <= m || nums1[i1] != 0)){
//                i1++;
//            } else {
//                int temp = nums1[i1];
//                nums1[i1] = nums2[i2];
//                nums2[i2] = temp;
//                if (i1 + 1 > m && nums2[i2] == 0){
//                    i2++;
//                } else {
//                    i1++;
//                }
//            }
//        }
//    }
}
