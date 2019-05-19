package edu.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] arrayNull = null;
//        System.out.println(Arrays.toString(mergeSort(arrayNull)));
//
//        int[] arrayEmpty = new int[0];
//        System.out.println(Arrays.toString(mergeSort(arrayEmpty)));
//
//        int[] array6 = new int[]{2, 10, 3, 1, 10, 5};
//        System.out.println(Arrays.toString(mergeSort(array6)));

        int[] array7 = new int[]{2, 5, 8, 1, 6, 7, 9};
        System.out.println(Arrays.toString(mergeSort(array7)));
    }

    static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

        int[] leftSorted = mergeSort(left);
        int[] rightSorted = mergeSort(right);

        return mergeInternal(leftSorted, rightSorted);
    }

    private static int[] mergeInternal(int[] leftSorted, int[] rightSorted) {
        int[] mergedArray = new int[leftSorted.length + rightSorted.length];
        int leftIterator = 0;
        int rightIterator = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            if (leftIterator == leftSorted.length) {
                mergedArray[i] = rightSorted[rightIterator++];
            } else if (rightIterator == rightSorted.length) {
                mergedArray[i] = leftSorted[leftIterator++];
            } else {
                if (leftSorted[leftIterator] < rightSorted[rightIterator]) {
                    mergedArray[i] = leftSorted[leftIterator++];
                } else {
                    mergedArray[i] = rightSorted[rightIterator++];
                }
            }
        }
        return mergedArray;
    }
}