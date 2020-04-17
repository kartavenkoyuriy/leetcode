package edu.problems.leetcode.n206;

import static edu.problems.leetcode.n206.ReverseLinkedList.populateListFive;
import static edu.problems.leetcode.n206.ReverseLinkedList.printList;

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
