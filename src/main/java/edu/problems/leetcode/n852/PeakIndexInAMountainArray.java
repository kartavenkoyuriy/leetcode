package edu.problems.leetcode.n852;

/*
852. Peak Index in a Mountain Array
Related Topics: Binary Search

Let's call an array A a mountain if the following properties hold:

    A.length >= 3
    There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]

Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:

Input: [0,1,0]
Output: 1

Example 2:

Input: [0,2,1,0]
Output: 1

Note:

    3 <= A.length <= 10000
    0 <= A[i] <= 10^6
    A is a mountain, as defined above.
 */
public class PeakIndexInAMountainArray {

    public static void main(String[] args) {
        System.out.println(new PeakIndexInAMountainArray().peakIndexInMountainArray(new int[]{0,2,1,0}));
    }

    private int peakIndexInMountainArray(int[] ints) {
        int low = 0;
        int hi = ints[ints.length-1];

        return 0;
    }

}

//    ||
//    ||
//   \  /
//    \/

























//    public int peakIndexInMountainArray(int[] A) {
//        int lo = 0;
//        int hi = A.length - 1;
//
//        while (lo < hi){
//            int mid = (lo + hi) / 2;
//            if (A[mid] > A[mid + 1]){
//                hi = mid;
//            } else {
//                lo = mid + 1;
//            }
//        }
//        return lo;
//    }

