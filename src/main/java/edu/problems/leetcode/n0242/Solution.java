package edu.problems.leetcode.n0242;
/*
242. Valid Anagram
DescriptionHintsSubmissionsDiscussSolution

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]){
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] letterCounter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letterCounter[s.charAt(i) - 'a']++;
            letterCounter[t.charAt(i) - 'a']--;
        }

        for (int i : letterCounter) {
            if (i != 0){
                return false;
            }
        }

        return true;
    }

}
