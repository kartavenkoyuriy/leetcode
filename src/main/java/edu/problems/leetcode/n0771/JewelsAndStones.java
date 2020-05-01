package edu.problems.leetcode.n0771;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        String J = "aA";
                String S = "aAAbbbb";
        System.out.println(3 + "|" + new JewelsAndStones().numJewelsInStones(J, S));
    }

    public int numJewelsInStones(String J, String S) {
        //check
        //edge cases
        Set<Character> jewels = new HashSet<>();
        for (char jewel : J.toCharArray()) {
            jewels.add(jewel);
        }
        int count = 0;
        for (char stone : S.toCharArray()) {
            if(jewels.contains(stone)){
                count++;
            }
        }
        return count;
    }

}
