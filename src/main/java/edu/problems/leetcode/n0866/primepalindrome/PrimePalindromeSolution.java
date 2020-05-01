package edu.problems.leetcode.n0866.primepalindrome;

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

//contains from task 9 and 204
public class PrimePalindromeSolution {

    public int primePalindrome(int N) {
        while (true){
            if (isPalindrome(N) && isPrime(N)){
                return N;
            }
            N++;
            // this HINT is the key to pass the 'time limit exceed'
            if (10_000_000 < N && N < 100_000_000){
                N = 100_000_000;
            }
        }
    }

    public boolean isPalindrome(int n){
        if (n < 0) return false;
        if (n < 10) return true;
        if (n % 10 == 0) return false; //eliminate 20 edge case

        int reversed = 0;
        while (n > reversed){
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return n == reversed || reversed / 10 == n;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n < 4) return true; //for 2,3 edge cases
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 3; i * i <= n; i += 2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println("ER|AR");
        PrimePalindromeSolution test = new PrimePalindromeSolution();
//        System.out.println(test.primePalindrome(77));
//        System.out.println(test.primePalindrome(9989900));
//        System.out.println("7|" + test.primePalindrome(6));
//        System.out.println("11|" + test.primePalindrome(8));
//        System.out.println("2|" + test.primePalindrome(1));
//        System.out.println("7|" + test.primePalindrome(4));
//        System.out.println("131|" + test.primePalindrome(102));
//        System.out.println(test.primePalindrome(45887963));
        long t = System.currentTimeMillis();
        System.out.println(test.primePalindrome(51633903));//time limit exceed
//        System.out.println(System.currentTimeMillis() - t);// 1123 (+ 1)
//        System.out.println(System.currentTimeMillis() - t);// 1020 (+ 2)
        System.out.println(System.currentTimeMillis() - t);// 1020 (+ 2)

    }

}
