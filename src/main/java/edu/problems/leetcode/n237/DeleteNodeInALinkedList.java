package edu.problems.leetcode.n237;

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

public class DeleteNodeInALinkedList {
    static ListNode listNode = populateListFive();
    static ListNode three = listNode.next.next;

    public static void main(String[] args) {
        printList(listNode);
        DeleteNodeInALinkedList instance = new DeleteNodeInALinkedList();
        instance.deleteNodeRec(three);
        printList(listNode);


    }

    public void deleteNode(ListNode node) {
        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
            } else {
                node = node.next;
            }
        }
    }

    public void deleteNodeRec(ListNode node) {
        node.val = node.next.val;
        if (node.next.next == null) {
            node.next = null;
            return;
        }
        deleteNodeRec(node.next);
    }


    private static void printList(ListNode head) {
        System.out.print(head);
        ListNode iter = head;
        while (iter.next != null) {
            System.out.print("->");
            System.out.print(iter.next);
            iter = iter.next;
        }
        System.out.println();
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
