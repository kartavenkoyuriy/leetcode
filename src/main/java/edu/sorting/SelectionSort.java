package edu.sorting;

import java.util.Arrays;

import static edu.sorting.SortingCommon.swapInt;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrayNull = null;
        System.out.println(Arrays.toString(selectionSort(arrayNull)));

        int[] arrayEmpty = new int[0];
        System.out.println(Arrays.toString(selectionSort(arrayEmpty)));

        int[] array6 = new int[]{2, 10, 3, 1, 10, 5};
        System.out.println(Arrays.toString(selectionSort(array6)));
    }

    static int[] selectionSort(int[] array) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swapInt(array, min, i);
        }

        return array;
    }
}
