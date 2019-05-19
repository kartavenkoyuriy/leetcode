package edu.sorting;

public class SortingCommon {
    static void swapInt(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}
