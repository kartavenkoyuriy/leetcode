package edu.problems.leetcode.n0461;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */

public class HammingDistance {

    public static void main(String[] args) {
        int x = 4;
        int y = 1;
        System.out.println(2 + "|" + new HammingDistance().hammingDistance(x, y));
    }

    public int hammingDistance(int x, int y) {
//        return Integer.bitCount(x ^ y);
        int bitDiff = x ^ y;
        int count = 0;
        while (bitDiff > 0) {
            if (bitDiff % 2 != 0) {
                count++;
            }
            bitDiff /= 2;
        }
        return count;
    }
}
