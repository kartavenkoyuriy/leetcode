package edu.problems.leetcode.n070;

/*
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Note: Given n will be a positive integer.

Example 1:
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
public class ClimbingStairs {
    /*
    1. recursion(like fibbonachi) - top down - time o(2^n), memory o(1)
    2. recursion with memoization - top down - time o(n), memory o(n)
    3. dp with array - bottom up - time o(n), memory o(n)
    4. dp with holding 2 prev numbers - bottom up - time o(n), memory o(n)
    <---- we are here
    5. binets method - time o(logn), memory o(n)
    6. fibbinacchi formula(pow takes logn) - time o(logn), memory o(n)
     */
    public int climbStairs(int n) {
        if (n < 3) return n;
        int previous = 2;
        int prePrevious = 1;
        for (int i = 3; i < n; i++) {
            previous = previous + prePrevious;
            prePrevious = previous - prePrevious;
        }
        return previous + prePrevious;
    }
}
