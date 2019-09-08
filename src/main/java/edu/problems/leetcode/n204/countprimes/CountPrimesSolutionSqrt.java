package edu.problems.leetcode.n204.countprimes;
/*
steps:
Let's write down all of 12's factors:

2 × 6 = 12
3 × 4 = 12
4 × 3 = 12
6 × 2 = 12

As you can see, calculations of 4 × 3 and 6 × 2 are not necessary.
Therefore, we only need to consider factors up to √n because, if n is divisible by some number p, then n = p × q and since p ≤ q, we could derive that p ≤ √n.
 */
public class CountPrimesSolutionSqrt extends CountPrimesSolutionBasic {
    private boolean isPrime(int number) {
        //edge cases here
        if(number <= 1){
            return false;
        }

        //i * i <= num faster than i <= sqrt(num)
        //starts from 2 because (number % 1 == 0) will always be true
        //"<= num" for "n=4" or "n=9", where should enter the loop to prove it is not prime
        for (int i = 2; i * i <= number ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
