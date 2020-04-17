package edu.problems.leetcode.n206;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return Integer.toString(val);
    }
}

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
}
