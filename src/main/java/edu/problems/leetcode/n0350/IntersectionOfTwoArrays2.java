package edu.problems.leetcode.n0350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        IntersectionOfTwoArrays2 i = new IntersectionOfTwoArrays2();

//        int[] nums1 = new int[]{1,2,2,3};
//        int[] nums2 = new int[]{2,2};
//        System.out.println(Arrays.toString(i.intersect(nums1, nums2)));


//        int[] nums1 = new int[]{9, 4, 9, 8, 4};
//        int[] nums2 = new int[]{9, 4, 5};
//        System.out.println(Arrays.toString(i.intersect(nums1, nums2)));

//        int[] nums1 = new int[]{9, 4, 5};
//        int[] nums2 = new int[]{9, 4, 9, 8, 4};
//        System.out.println(Arrays.toString(i.intersect(nums1, nums2)));


    }

    //time - O(N log N), space - O(N)
    //sort both, then 2 pointers

    //time - O(N), space - O(N)
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;
        if (nums1.length == 0 || nums2.length == 0) return new int[]{};
        HashMap<Integer, Integer> count = new HashMap<>();
        //ideally - which is less - should be cached
        for (int arrVal : nums1) {
            count.put(arrVal, count.getOrDefault(arrVal, 0) + 1);
        }
        ArrayList<Integer> listResult = new ArrayList<>();
        //looking for duplicates and save
        for (int arrVal : nums2) {
            if (count.containsKey(arrVal)) {
                if (count.get(arrVal) > 0) {
                    listResult.add(arrVal);
                    count.put(arrVal, count.get(arrVal) - 1);
                }
            }
        }
        int[] arrResult = new int[listResult.size()];
        for (int i = 0; i < listResult.size(); i++) {
            arrResult[i] = listResult.get(i);
        }
        return arrResult;
    }

//time - O(N^2), space - O(N)
//    public int[] intersect(int[] nums1, int[] nums2) {
//        if (nums1 == null || nums2 == null) return null;
//        if (nums1.length == 0 || nums2.length == 0) return new int[]{};
//        ArrayList<Integer> result = new ArrayList<>();
//        boolean[] match2 = new boolean[nums2.length];
//        OUTER:
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j] && !match2[j]) {
//                    result.add(nums1[i]);
//                    match2[j] = true;
//                    continue OUTER;
//                }
//            }
//        }
//        //avoid boilerplate with List<Integer> to int[] conversion
//        return result.stream().mapToInt(i -> i).toArray();
//    }

    //another problem
    static class User {
        String name;
        List<String> phones;

        public static void main(String[] args) {
            System.out.println("---");

            String phone1 = "589";
            String phone2 = "579";
            String phone3 = "58";
            String phone4 = "0";

            List<User> users = new ArrayList<>();

            User u1 = new User();
            u1.name = "one";
            u1.phones = new ArrayList<>();
            u1.phones.add(phone4);
            users.add(u1);

            User u2 = new User();
            u2.name = "two";
            u2.phones = new ArrayList<>();
            u2.phones.add(phone2);
            u2.phones.add(phone3);
            users.add(u2);

            User u3 = new User();
            u3.name = "three";
            u3.phones = new ArrayList<>();
            u3.phones.add(phone1);
            u3.phones.add(phone3);
            users.add(u3);

            User u4 = new User();
            u4.name = "four";
            u4.phones = new ArrayList<>();
            u4.phones.add(phone2);
            u4.phones.add(phone4);
            users.add(u4);

            String prefix = "58";
            List<User> collect = users
                    .stream()
                    .filter(x ->
                            x.phones
                                    .stream()
                                    .anyMatch(phone -> phone.startsWith(prefix)))
                    .collect(Collectors.toList());
            System.out.println(collect);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", phones=" + phones +
                    '}';
        }
    }

}