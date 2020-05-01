package edu.problems.leetcode.n0344;

import java.util.Arrays;
/*
Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        final char[] chars = {};
        final char[] chars1 = {'a'};
        final char[] chars2 = {'a', 'b'};
        final char[] chars3 = {'a', 'b', 'c'};
        final char[] chars4 = {'a', 'b', 'c', 'd'};
        final char[] chars5 = {'a', 'b', 'c', 'd', 'e'};

        reverseString(chars);
        System.out.println(Arrays.toString(chars));
        reverseString(chars1);
        System.out.println(Arrays.toString(chars1));
        reverseString(chars2);
        System.out.println(Arrays.toString(chars2));
        reverseString(chars3);
        System.out.println(Arrays.toString(chars3));
        reverseString(chars4);
        System.out.println(Arrays.toString(chars4));
        reverseString(chars5);
        System.out.println(Arrays.toString(chars5));
    }
}
