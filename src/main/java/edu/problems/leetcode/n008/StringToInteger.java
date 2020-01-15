package edu.problems.leetcode.n008;

/*
8. String to Integer (atoi)
Medium

Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

    Only the space character ' ' is considered as whitespace character.
    Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.

Example 1:

Input: "42"
Output: 42

Example 2:

Input: "   -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.

Example 3:

Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.

Example 4:

Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical
             digit or a +/- sign. Therefore no valid conversion could be performed.

Example 5:

Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.


 */
public class StringToInteger {

    public static void main(String[] args) {

//testing
//        int a = -10;
//        System.out.println(a*10 + -5);
//        System.out.println(0*10 + -5);
//
//        int min = -214748364;
//        int m = -9;
//        System.out.println(min * 10 + m);
//        System.out.println(0 * 10 + -0);

        StringToInteger s = new StringToInteger();
        System.out.println("request|ER|AR");
        System.out.println("NULL" + "|" + "0" + "|" + s.myAtoi(null));
        System.out.println("" + "|" + "0" + "|" + s.myAtoi(""));
        System.out.println("2a" + "|" + "2" + "|" + s.myAtoi("2a"));
        System.out.println("a2" + "|" + "0" + "|" + s.myAtoi("a2"));
        System.out.println("-2a2" + "|" + "-2" + "|" + s.myAtoi("-2a2"));
        System.out.println("--" + "|" + "0" + "|" + s.myAtoi("--"));
        System.out.println("-02" + "|" + "-2" + "|" + s.myAtoi("-02"));
        System.out.println(" - 1" + "|" + "0" + "|" + s.myAtoi(" - 1"));
        System.out.println("+1" + "|" + "1" + "|" + s.myAtoi("+1"));
        System.out.println("0" + "|" + "0" + "|" + s.myAtoi("0"));
        System.out.println("+2147483648" + "|" + "2147483647" + "|" + s.myAtoi("+2147483648"));
        System.out.println("2147483648" + "|" + "2147483647" + "|" + s.myAtoi("2147483648"));
        System.out.println("-2147483649" + "|" + "-2147483648" + "|" + s.myAtoi("-2147483649"));
        System.out.println("+3333333333" + "|" + "2147483647" + "|" + s.myAtoi("+3333333333"));
        System.out.println("+5555555555" + "|" + "2147483647" + "|" + s.myAtoi("+5555555555"));
        System.out.println("+7777777777" + "|" + "2147483647" + "|" + s.myAtoi("+7777777777"));
        System.out.println("+9999999999" + "|" + "2147483647" + "|" + s.myAtoi("+9999999999"));
        System.out.println("-3333333333" + "|" + "-2147483648" + "|" + s.myAtoi("-3333333333"));
        System.out.println("-5555555555" + "|" + "-2147483648" + "|" + s.myAtoi("-5555555555"));
        System.out.println("-7777777777" + "|" + "-2147483648" + "|" + s.myAtoi("-7777777777"));
        System.out.println("-9999999999" + "|" + "-2147483648" + "|" + s.myAtoi("-9999999999"));

        System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);
        System.out.println(2147483647 / 10 + 9);


        System.out.println("-9999999999" + "|" + "-2147483648" + "|" + s.myAtoi("-9999999999"));


    }

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;//common check

        //looking for sign and first digit
        int startIndex = 0;
        boolean isSigned = false;
        boolean isPositive = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (isSigned) return 0;//"- 2"
            } else if (c == '+' || c == '-') {
                if (isSigned) return 0;//"--1"
                if (c == '+') {
                    isPositive = true;
                }
                isSigned = true;
            } else if (Character.isDigit(c)) {
                if (!isSigned) isPositive = true;
                startIndex = i;
                break;
            } else {
                return 0;//"d2"
            }
        }

        //parse number
        int result = 0;
        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) break;//"23a5"
            int digit = c - '0';
            if (!isPositive) digit = -digit;

            if (isPositive && Integer.MAX_VALUE / 10 < result) return Integer.MAX_VALUE;
            if (!isPositive && Integer.MIN_VALUE / 10 > result) return Integer.MIN_VALUE;

            result = result * 10 + digit;

            if (isPositive && result < 0) return Integer.MAX_VALUE;
            if (!isPositive && result > 0) return Integer.MIN_VALUE;
        }
        return result;
    }
}
