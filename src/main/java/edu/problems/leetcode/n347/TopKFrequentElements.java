package edu.problems.leetcode.n347;
/*
Given a non-empty array of integers, return the k most frequent elements.

        Example 1:

        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]

        Example 2:

        Input: nums = [1], k = 1
        Output: [1]

        Note:

        You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
        Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKFrequentElements {

    public static void main(String[] args) {
//        final int[] int01 = {1, 1, 1, 2, 2, 3};
//        final int[] int02 = {1, 2, 1, 3, 1, 3, 4};
        final int[] int03 = {1, 2};
        final int[] int04 = {4,1,-1,2,-1,2,3};
//        System.out.println(topKFrequentTree(int01, 2));
//        System.out.println(topKFrequentTree(int02, 2));
        System.out.println(topKFrequentTree(int03, 2));
    }

    static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> nta = new HashMap<>();
        List<Integer> tn = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int a;
            Integer fetchedA = nta.get(n);
            if (fetchedA == null) {
                a = 1;
            } else {
                a = fetchedA + 1;
            }
            nta.put(n, a);
            updateList(nta, tn, n, k);
        }
        return tn;
    }

    private static void updateList(Map<Integer, Integer> nta, List<Integer> tn, int n, int k) {
        if (tn.contains(n)) {
            return;
        }
        if (tn.size() < k) {
            tn.add(n);
        }
        for (int i = 0; i < tn.size(); i++) {
            if (nta.get(tn.get(i)) < nta.get(n)) {
                tn.remove(i);
                tn.add(n);
                break;
            }
        }
    }

    //WRONG
    static List<Integer> topKFrequentTree(int[] nums, int k) {
        HashMap<Integer, Integer> nta = new HashMap<>();
        TreeMap<Integer, Integer> atn = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int a;
            Integer fetchedA = nta.get(n);
            if (fetchedA == null) {
                a = 1;
            } else {
                a = fetchedA + 1;
            }
            nta.put(n, a);
            if (atn.size() < k){
                int tempNum = a;
                while(atn.get(tempNum) != null){
                    tempNum--;
                }
                atn.put(tempNum, n);
            } else {
                if(atn.firstKey() <= a){
                    atn.remove(atn.firstKey());
                    atn.put(a, n);
                }
            }
        }
        final ArrayList<Integer> list = new ArrayList<>(atn.values());
        Collections.reverse(list);
        return list;
    }
}
