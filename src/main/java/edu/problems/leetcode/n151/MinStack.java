package edu.problems.leetcode.n151;

public class MinStack {

    public static void main(String[] args) {
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        int min = minStack.getMin();// Returns -3.
//        minStack.pop();
//        int top = minStack.top();// Returns 0.
//        int min1 = minStack.getMin();// Returns -2.
//        System.out.println(min);
//        System.out.println(top);
//        System.out.println(min1);

//["MinStack","push","push","push","getMin","top","pop","getMin"]
//[[],[-2],[0],[-1],[],[],[],[]]

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        int min = minStack.getMin();
        int top = minStack.top();
        minStack.pop();
        int min1 = minStack.getMin();
        System.out.println(min);
        System.out.println(top);
        System.out.println(min1);
    }

    Node head;

    public MinStack() {

    }

    public void push(int x) {
        Node n = new Node();
        n.value = x;
        if (head == null){
            n.localMin = x;
        } else {
            n.localMin = Math.min(x, head.localMin);
        }
        n.next = head;
        head = n;
    }

    public void pop() {
        if (head == null) return; // or throw IAE
        head = head.next;
    }

    public int top() {
        if (head == null) return -1; // or throw IAE

        return head.value;
    }

    public int getMin(){
        if (head == null) return -1; // or throw IAE

        return head.localMin;
    }

    class Node{
        int value;
        int localMin;
        Node next;
    }
}
