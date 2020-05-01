package edu.problems.leetcode.n0019;

import edu.problems.leetcode._collections.ListNode;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null) {
            fast = fast.next;
            if (n == 0){
                slow = slow.next;
            } else {
                n--;
            }
        }

        if (slow == head && n > 0){
            return head.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
