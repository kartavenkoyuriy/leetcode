package edu.problems.leetcode.n0206;


import edu.problems.leetcode._collections.ListNode;

import static edu.problems.leetcode._collections.ListNode.populateListFive;
import static edu.problems.leetcode._collections.ListNode.printList;

public class ReverseLinkedList1 {

    public static void main(String[] args) {
        ListNode five = populateListFive();
        printList(reverseList(five));
    }

    static ListNode reverseList(ListNode head){
        if(head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
