package edu.problems.leetcode.n0977.squaresofasortedarray;

import java.util.Arrays;

public class SquaredOfASortedArraySolution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length / 2; i++) {
            A[i] = (int) Math.pow(A[i], 2);
            A[A.length - i - 1] = A[A.length - i - 1] * A[A.length - i - 1];
        }
        if(A.length == 1){
            A[0] = A[0] * A[0];
        }
        if(A.length % 2 != 0 && A.length > 1){
            A[A.length / 2] = A[A.length / 2] * A[A.length / 2];
        }
        Arrays.sort(A);
        return A;
    }

    //TODO merge subarrays(minus and plus) for log(N)
    public int[] sortedSquaresSameButSimple(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-4,-1,0,3,10};
//        int[] a = new int[]{1};
//        int[] a = new int[]{5};
        SquaredOfASortedArraySolution test = new SquaredOfASortedArraySolution();
        System.out.println(Arrays.toString(test.sortedSquaresSameButSimple(a)));
    }
}
