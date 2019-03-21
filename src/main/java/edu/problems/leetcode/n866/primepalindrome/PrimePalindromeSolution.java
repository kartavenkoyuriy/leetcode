package edu.problems.leetcode.n866.primepalindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Find the smallest prime palindrome greater than or equal to N.
Recall that a number is prime if it's only divisors are 1 and itself, and it is greater than 1.
For example, 2,3,5,7,11 and 13 are primes.
Recall that a number is a palindrome if it reads the same from left to right as it does from right to left.
For example, 12321 is a palindrome.


Example 1:
Input: 6
Output: 7

Example 2:
Input: 8
Output: 11

Example 3:
Input: 13
Output: 101

Note:
    1 <= N <= 10^8
    The answer is guaranteed to exist and be less than 2 * 10^8.
 */
public class PrimePalindromeSolution {

    public int primePalindrome(int N) {
        return getNextPrimePalindrome(N);
    }

    public int getNextPrimePalindrome(int n) {
        int count = n;
        while (true) {
            if (isPalindrome(count) && isPrime(count)) {
                return count;
            }
            count++;
        }
    }

    //TODO 1 optimize check
    public boolean isPrime(int numberToTest) {
        if (numberToTest == 1){
            return false;
        }
        final int sqrt = (int)Math.ceil(Math.sqrt(numberToTest));
        for (int i = 2; i <= sqrt; i++) {
            if(numberToTest % i == 0){
                return false;
            }
        }

        return true;
    }

    public boolean isPrimeNew(int numberToTest) {
        if (numberToTest <= 3){
            return numberToTest > 1;
        } else if (numberToTest % 2 == 0 || numberToTest % 3 == 0){
            return false;
        } else {
//            final int sqrt = (int)Math.ceil(Math.sqrt(numberToTest));
//            for (int i = 2; i * 2 < numberToTest; i++) {
//                if(numberToTest % i == 0){
//                    return false;
//                }
//            }
            for (int i = 5; i * i <= numberToTest; i = i + 6)
                if (numberToTest % i == 0 || numberToTest % (i + 2) == 0)
                    return false;

            return true;
        }
    }

//    public boolean isPrimeOld(int numberToTest) {
//        if (numberToTest == 1){
//            return false;
//        }
////        final int sqrt = (int)Math.ceil(Math.sqrt(numberToTest));
//        for (int i = 2; i < numberToTest - 1; i++) {
//            if(numberToTest % i == 0){
//                return false;
//            }
//        }
//
//        return true;
//    }


    //TODO 2 replace list with array?
    public boolean isPalindrome(int numberToTest) {
        if(numberToTest < 0){
            return false;
        }
        //2*10^8
        List<Integer> numbersList = new ArrayList<>();
        int updatedNumber = numberToTest;
        while (updatedNumber != 0){
            numbersList.add(updatedNumber % 10);
            updatedNumber /= 10;
        }

        for (int i = 0; i < numbersList.size() / 2; i++) {
            if (!numbersList.get(i).equals(numbersList.get(numbersList.size() - 1 - i))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PrimePalindromeSolution test = new PrimePalindromeSolution();
//        test.isPalindrome(123321);
//        System.out.println(test.getNextPrimePalindrome(77));
        System.out.println(test.getNextPrimePalindrome(9989900));
//        System.out.println(test.getNextPrimePalindrome(6));
    }

}
