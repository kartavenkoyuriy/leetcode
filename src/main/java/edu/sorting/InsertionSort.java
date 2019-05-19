package edu.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrayNull = null;
        System.out.println(Arrays.toString(insertionSortInt(arrayNull)));

        int[] arrayEmpty = new int[0];
        System.out.println(Arrays.toString(insertionSortInt(arrayEmpty)));

        int[] array6 = new int[]{2, 10, 3, 1, 10, 5};
        System.out.println(Arrays.toString(insertionSortInt(array6)));
    }

    static int[] insertionSortInt(int[] array) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > val) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = val;
        }

        return array;
    }
}
