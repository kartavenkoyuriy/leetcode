package edu.problems.leetcode.n0728;

import java.util.ArrayList;
import java.util.List;

/*

 A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:

Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

Note:
The boundaries of each input argument are 1 <= left <= right <= 10000.
 */

/*
1. list selfDifResult
2. fori
2.1. if checkMethod -> add


3. check method
3.1. if % 10 -> false
3.2. save number cuz we need to div it
3.3. return last digit != 0 && n % d == 0

4. return list in outer method

 */

public class SelfDividingNumbers {

    public static void main(String[] args) {
        int left = 1;
        int right = 22;

        System.out.println(new SelfDividingNumbers().selfDividingNumbers(1, 22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDifInteger = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(isSelfDiff(i)){
                selfDifInteger.add(i);
            }
        }
        return selfDifInteger;
    }

    private boolean isSelfDiff(int i) {
        int partOfNumber = i;
        while(partOfNumber > 0){
            if (partOfNumber % 10 == 0 || i % (partOfNumber % 10) != 0){
                return false;
            }
            partOfNumber /= 10;
        }
        return true;
    }

}