package edu.problems.leetcode.n206;

import edu.problems.leetcode._collections.ListNode;

import static edu.problems.leetcode._collections.ListNode.populateListFive;
import static edu.problems.leetcode._collections.ListNode.printList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode five = populateListFive();
        printList(reverseListRec2(five));
    }

    public static ListNode reverseListRec2(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseListRec2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static ListNode reverseListRec(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode next = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return next;
    }

    public static ListNode reverseListIter(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        return prev;
    }
}
