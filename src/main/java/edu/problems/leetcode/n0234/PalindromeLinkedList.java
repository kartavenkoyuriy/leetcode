package edu.problems.leetcode.n0234;

import edu.problems.leetcode._collections.ListNode;

import static edu.problems.leetcode._collections.ListNode.populatePalindromeListSeven;
import static edu.problems.leetcode._collections.ListNode.populatePalindromeListSix;

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
        System.out.println(new PalindromeLinkedList().isPalindrome(populatePalindromeListSix()));
        System.out.println(new PalindromeLinkedList().isPalindrome(populatePalindromeListSeven()));
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