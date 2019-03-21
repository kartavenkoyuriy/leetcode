package edu.problems.leetcode.n009.palindromenumber;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumberSolution {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }

    public int reverseNumber(int number) {
        int reversed = 0;
        int numberThatLast = number;
        while (numberThatLast != 0) {
            reversed = (reversed * 10) + numberThatLast % 10;
            numberThatLast = numberThatLast / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        PalindromeNumberSolution test = new PalindromeNumberSolution();
        System.out.println("true:" + test.isPalindrome(0));
        System.out.println("true:" + test.isPalindrome(6));
        System.out.println("false:" + test.isPalindrome(10));
        System.out.println("false:" + test.isPalindrome(100));
        System.out.println("false:" + test.isPalindrome(1000));
        System.out.println("true:" + test.isPalindrome(11));
        System.out.println("false:" + test.isPalindrome(29));
        System.out.println("true:" + test.isPalindrome(565));
        System.out.println("false:" + test.isPalindrome(789));
        System.out.println("true:" + test.isPalindrome(8998));
        System.out.println("false:" + test.isPalindrome(1234));
        System.out.println("false:" + test.isPalindrome(21120));

//        System.out.println(test.reverseNumber(123));
    }

    public boolean isPalindromeSimpleCorrect(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> numbersList = new ArrayList<>();
        int updatedNumber = x;
        while (updatedNumber != 0) {
            numbersList.add(updatedNumber % 10);
            updatedNumber /= 10;
        }

        for (int i = 0; i < numbersList.size() / 2; i++) {
            if (!numbersList.get(i).equals(numbersList.get(numbersList.size() - 1 - i))) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromeBetter(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }

        int reversed = 0;
        int numberThatLast = x;
        while (reversed <= numberThatLast) {
            reversed = (reversed * 10) + numberThatLast % 10;
            if (reversed == numberThatLast && reversed / 10 != 0) {
                return true;
            }
            numberThatLast = numberThatLast / 10;
            if (reversed == numberThatLast || ((reversed / 10 != 0) && (reversed == (numberThatLast / 10)))) {
                return true;
            }
        }

        return false;
    }
}
