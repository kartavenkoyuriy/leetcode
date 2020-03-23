package edu.problems.leetcode.n242;

public class ValidAnagram {
    public static void main(String[] args) {


    }

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for (int amount : chars) {
            if (amount != 0) {
                return false;
            }
        }
        return true;
    }
}
