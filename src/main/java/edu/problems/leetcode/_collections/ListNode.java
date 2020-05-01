package edu.problems.leetcode._collections;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return Integer.toString(val);
    }

    public static void printList(ListNode head) {
        System.out.print(head);
        ListNode iter = head;
        while (iter.next != null){
            System.out.print("->");
            System.out.print(iter.next);
            iter = iter.next;
        }
    }

    public static ListNode populateListFive() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        return one;
    }

    public static ListNode populateListSeven() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(5);
        ListNode five = new ListNode(2);
        ListNode six = new ListNode(3);
        ListNode seven = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        return one;
    }

    public static ListNode populateListSix() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(4);
        ListNode three = new ListNode(-1);
        ListNode four = new ListNode(-1);
        ListNode five = new ListNode(4);
        ListNode six = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        return one;
    }
}