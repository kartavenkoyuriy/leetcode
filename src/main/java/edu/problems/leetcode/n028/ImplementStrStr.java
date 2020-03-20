package edu.problems.leetcode.n028;

/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 */
public class ImplementStrStr {

    public static void main(String[] args) {
        ImplementStrStr i = new ImplementStrStr();

        System.out.println(i.strStr("aa", "aaa") + "|" + -1);

        System.out.println("calculations|answer");
        System.out.println(i.strStr("aa", "aa") + "|" + 0);
        System.out.println(i.strStr("abaa", "aa") + "|" + 2);
        System.out.println(i.strStr("hello", "aa") + "|" + -1);
        System.out.println(i.strStr("hello", "ll") + "|" + 2);
        System.out.println(i.strStr("alhello", "ll") + "|" + 4);
        System.out.println(i.strStr("alheloll", "ll") + "|" + 6);
        System.out.println(i.strStr("alhelol", "ll") + "|" + -1);

        System.out.println(i.strStr("mississippi", "issip") + "|" + 4);

    }

    public static void outerBreakVsContinue() {
        outerloop:
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    break outerloop;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Done");

        System.out.println("---");

        outerloop:
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    continue outerloop;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Done");
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) throw new IllegalArgumentException();
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;

        OUTER:
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                int hi = i;
                int ni = 0;
                while (ni < needle.length()){
                    if (hi == haystack.length()){
                        break OUTER;
                    }
                    if (haystack.charAt(hi) != needle.charAt(ni)){
                        continue OUTER;
                    } else {
                        hi++;
                        ni++;
                    }
                }
                return i;
            }
        }
        return -1;
    }

}
