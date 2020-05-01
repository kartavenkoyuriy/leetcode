package edu.problems.leetcode.n0009.palindromenumber.afterpaper;

public class PalindromeNumberSolution {

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int reversedValue = 0;
        while (x > reversedValue) {
            reversedValue = addDigitToReversedValue(x, reversedValue);
            x = subtractDigitFromInitialValue(x);
            if (x == reversedValue || x / 10 == reversedValue) {
                return true;
            }
        }

        return false;
    }

    static int addDigitToReversedValue(int initialValue, int reversedValue) {
        int digitToAdd = initialValue % 10;
        return reversedValue * 10 + digitToAdd;
    }

    static int subtractDigitFromInitialValue(int initialValue) {
        return initialValue / 10;
    }

    public static void main(String[] args) {
        System.out.println("true:" + isPalindrome(0));
        System.out.println("true:" + isPalindrome(1));
        System.out.println("true:" + isPalindrome(2));
        System.out.println("true:" + isPalindrome(3));
        System.out.println("true:" + isPalindrome(6));
        System.out.println("false:" + isPalindrome(10));
        System.out.println("false:" + isPalindrome(100));
        System.out.println("false:" + isPalindrome(1000));
        System.out.println("true:" + isPalindrome(11));
        System.out.println("false:" + isPalindrome(29));
        System.out.println("false:" + isPalindrome(30));
        System.out.println("false:" + isPalindrome(300));
        System.out.println("false:" + isPalindrome(-121));
        System.out.println("true:" + isPalindrome(565));
        System.out.println("false:" + isPalindrome(789));
        System.out.println("true:" + isPalindrome(8998));
        System.out.println("false:" + isPalindrome(1234));
        System.out.println("false:" + isPalindrome(21120));
        System.out.println("true:" + isPalindrome(100878001));
    }
}
