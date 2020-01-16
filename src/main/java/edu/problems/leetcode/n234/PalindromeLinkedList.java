package edu.problems.leetcode.n234;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        /*
        Input
[1,4,-1,-1,4,1]
Output
false
Expected
true
         */
        System.out.println(new PalindromeLinkedList().isPalindrome(populateListSix()));
        System.out.println(new PalindromeLinkedList().isPalindrome(populateListSeven()));
    }

    private static ListNode populateListSeven() {
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

    private static ListNode populateListSix() {
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

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        //get half list Node
        ListNode slow = head;
        ListNode fast = head;
        int halfSize = 0;
        while (fast != null) {
            if (fast.next == null) {
                slow = slow.next;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
            halfSize++;
        }
        ListNode half = slow;

        //reverse first half of the list
        if (half.next == null) return half.val == head.val;//corner case, list of 2 elems
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while (halfSize > 0){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
            halfSize--;
        }

        //compare from center to sides
        while (prev != null){
            if (prev.val != half.val) return false;
            prev = prev.next;
            half = half.next;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return Integer.toString(val);
    }
}