package edu.problems.leetcode.n020;

import java.util.ArrayDeque;

public class ValidParenthesis {
    public static void main(String[] args) {
        ValidParenthesis v = new ValidParenthesis();
        System.out.println("yes" + v.isValid("()"));
        System.out.println("yes" + v.isValid("()[]{}"));
        System.out.println("no" + v.isValid("(]"));
        System.out.println("no" + v.isValid("([)]"));
        System.out.println("yes" + v.isValid("([])"));

    }

    boolean isValid(String s) {
        if (s == null) return false;
        ArrayDeque<Character> dek = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpen(c)) {
                dek.addFirst(c);
            } else {
                if (dek.isEmpty()) return false;
                if (getOpenFor(c) == dek.peekFirst()) {
                    dek.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return dek.isEmpty();
    }

    private char getOpenFor(char c) {
        if (c == ')') return '(';
        if (c == '}') return '{';
        if (c == ']') return '[';
        throw new IllegalArgumentException();
    }

    private boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
