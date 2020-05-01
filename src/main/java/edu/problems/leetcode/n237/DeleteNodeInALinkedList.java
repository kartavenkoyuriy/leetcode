package edu.problems.leetcode.n237;

import edu.problems.leetcode._collections.ListNode;

import static edu.problems.leetcode._collections.ListNode.populateListFive;
import static edu.problems.leetcode._collections.ListNode.printList;

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
}
