package edu.problems.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Need to find all numbers which sum will be a given number in a given array.
 */
public class CountPairs {

    public static void main(String[] args) {
        int[] array7 = new int[]{2, 5, 8, 1, 6, 7, 9};
        int n = 13;
        printSumNumbers(array7, n);
    }

    static void printSumNumbers(int[] a, int sum) {
        final HashSet<Integer> negateInts = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            negateInts.add(sum - a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (negateInts.contains(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
}
