package edu.sorting;

import java.util.Arrays;

import static edu.sorting.SortingCommon.swapInt;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayNull = null;
        System.out.println(Arrays.toString(bubbleSort(arrayNull)));

        int[] arrayEmpty = new int[0];
        System.out.println(Arrays.toString(bubbleSort(arrayEmpty)));

        int[] array6 = new int[]{2, 10, 3, 1, 10, 5};
        System.out.println(Arrays.toString(bubbleSort(array6)));
    }

    static int[] bubbleSort(int[] array) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swapInt(array, j, j - 1);
                }
            }
        }

        return array;
    }
}
