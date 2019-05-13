package edu.problems.leetcode.n204.countprimes;

import java.util.ArrayList;
import java.util.List;

/*
Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

/*

steps:
1. N^2 by iterating on all numbers up to n(O(N)); for each isPrime(O(N)) - not modulo by any except n and 1
2. we can count only to half(n / 2), because each next will be n * 2, which is not prime
 */
public class CountPrimesSolutionBasic {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        //"number / 2 + 1" - handle "4" case, for pass 4 into the loop
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CountPrimesSolutionBasic test = new CountPrimesSolutionBasic();
        test.timing(0, 0, test);
        test.timing(0, 1, test);
        test.timing(0, 2, test);
        test.timing(1, 3, test);
        test.timing(2, 4, test);
        test.timing(2, 5, test);
        test.timing(3, 6, test);
        test.timing(3, 7, test);
        test.timing(4, 8, test);
        test.timing(4, 9, test);
        test.timing(4, 10, test);
        test.timing(8, 20, test);
        test.timing(25, 100, test);
        test.timing(168, 1000, test);
        test.timing(1229, 10_000, test);
        test.timing(9592, 100_000, test);//1:11769; 2:7857; 3:5222; 4:3683; 5:3046; 6v2:1373; sqrt-15;
        test.timing(78498, 1_000_000, test);//1:***; 2:***; 3:***; 4:***; 5:298466; 6v2:101805; sqrt-242;
        test.timing(664579, 10_000_000, test);//6v2:8089740; sqrt-5261;
        test.timing(5761455, 100_000_000, test);//sqrt-135046;
        test.timing(50847534, 1_000_000_000, test);
    }

    private void timing(int expectedResult, int value, CountPrimesSolutionBasic test) {
        final long start = System.currentTimeMillis();
        System.out.println(expectedResult + ":" + test.countPrimes(value) + "|" + (System.currentTimeMillis() - start));
    }

    public int countPrimes_bestAsForNow(int n) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        OUTER:
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i % list.get(j) == 0) {
                    continue OUTER;
                }
            }
            int divider = i - 1;
            while (divider != 1) {
                if (i % divider == 0) {
                    continue OUTER;
                }
                divider--;
            }
            count++;
            list.add(i);
        }
        return count;
    }

}
