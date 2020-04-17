package edu.problems.leetcode.n0007;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(-321 % 10);
        System.out.println(new ReverseInteger().reverse(-321));
        System.out.println(new ReverseInteger().reverse(1234567899));
        System.out.println(new ReverseInteger().reverse(-1234567899));
    }

    public int reverse(int x) {
//        boolean isNegative = Integer.signum(x) == -1;
        int reversed = 0;



        while (x != 0){
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10){
                return 0;
            }
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

//        if (isNegative){
//            reversed = -reversed;
//        }

        return reversed;
    }
}
