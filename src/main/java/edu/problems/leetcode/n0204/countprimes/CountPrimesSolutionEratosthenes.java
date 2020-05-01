package edu.problems.leetcode.n0204.countprimes;

public class CountPrimesSolutionEratosthenes extends CountPrimesSolutionBasic{
    public int countPrimes(int n){
        boolean[] isPrimes = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrimes[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrimes[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrimes[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) count++;
        }
        return count;
    }
}
