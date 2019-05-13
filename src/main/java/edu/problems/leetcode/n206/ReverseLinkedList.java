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
        printList(reverseListRec(five));
    }

    public static ListNode reverseListRec(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode next = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return next;
    }

    public static ListNode reverseListIter(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode currentNode = head;
        ListNode nextNode = head.next;
        currentNode.next = null;
        while(true){
            if(nextNode == null){
                break;
            }
            ListNode nextNextNode = nextNode.next;
            nextNode.next = currentNode;
            currentNode = nextNode;
            nextNode = nextNextNode;
        }
        return currentNode;
    }

    private static void printList(ListNode head) {
        System.out.print(head);
        ListNode iter = head;
        while (iter.next != null){
            System.out.print("->");
            System.out.print(iter.next);
            iter = iter.next;
        }
    }

    private static ListNode populateListFive() {
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
