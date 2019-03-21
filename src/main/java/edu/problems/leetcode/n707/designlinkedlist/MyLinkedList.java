package edu.problems.leetcode.n707.designlinkedlist;

public class MyLinkedList {

    class Node {

        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int listLength;

    //TODO 3 make int -> short
    //TODO 4 optimize on forums
    //TODO 5 optimize on javadoc

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        listLength = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || head == null) {
            return -1;
        }
        int count = 0;
        Node iterator = head;
        while (iterator != null) {
            if (index == count) {
                return iterator.val;
            }
            count++;
            iterator = iterator.next;
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node nodeToAdd = new Node(val);
        if (head == null) {
            head = nodeToAdd;
            tail = head;
        } else {
            nodeToAdd.next = head;
            head.prev = nodeToAdd;
            head = nodeToAdd;
        }
        listLength++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node nodeToAdd = new Node(val);
        if (tail == null) {
            tail = nodeToAdd;
            head = tail;
        } else {
            nodeToAdd.prev = tail;
            tail.next = nodeToAdd;
            tail = nodeToAdd;
        }
        listLength++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    //TODO 1 Optimize through linkedlist length and pass from both sides
    public void addAtIndex(int index, int val) {
        Node nodeToPaste = new Node(val);
        if (index == 0) {
            addAtHead(val);
        } else if (index == listLength) {
            addAtTail(val);
        } else {
            int count = 0;
            Node iterator = head;
            while (iterator != null) {
                if (count == index) {
                    nodeToPaste.next = iterator;
                    nodeToPaste.prev = iterator.prev;
                    iterator.prev.next = nodeToPaste;
                    iterator.prev = nodeToPaste;
                    listLength++;
                    return;
                }
                iterator = iterator.next;
                count++;
            }
        }


    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    //TODO 2 Optimization refactor index validation to a separate method
    public void deleteAtIndex(int index) {
        if (!(index < 0 || head == null)) {
            int count = 0;
            Node iterator = head;
            while (iterator != null) {
                if (count == index) {
                    if (iterator == head && iterator == tail) {
                        head = null;
                        tail = null;
                    } else if (iterator == head) {
                        head = iterator.next;
                        head.prev = null;
                    } else if (iterator == tail) {
                        tail = iterator.prev;
                        tail.next = null;
                    } else {
                        iterator.prev.next = iterator.next;
                        iterator.next.prev = iterator.prev;
                    }
                    listLength--;
                    return;
                }
                iterator = iterator.next;
                count++;
            }
        }
    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */

    /*
    ["MyLinkedList","addAtHead","get","addAtTail","deleteAtIndex","addAtHead","deleteAtIndex","get","addAtTail","addAtHead","addAtTail","addAtTail","addAtTail","addAtIndex","get","addAtIndex","addAtHead","deleteAtIndex","addAtIndex","addAtHead","addAtIndex","deleteAtIndex","get","addAtTail","deleteAtIndex","deleteAtIndex","addAtTail","addAtTail","addAtIndex","addAtHead","get","get","addAtTail","addAtTail","addAtTail","addAtTail","addAtIndex","addAtIndex","addAtHead","addAtIndex","addAtTail","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","addAtHead","deleteAtIndex","addAtHead","get","addAtHead","get","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtTail","deleteAtIndex","get","addAtIndex","addAtHead","addAtTail","deleteAtIndex","addAtHead","addAtIndex","deleteAtIndex","deleteAtIndex","deleteAtIndex","addAtHead","addAtTail","addAtTail","addAtHead","addAtTail","addAtIndex","deleteAtIndex","deleteAtIndex","addAtIndex","addAtHead","addAtHead","addAtTail","get","addAtIndex","get","addAtHead","addAtHead","addAtHead","addAtIndex","addAtIndex","get","addAtHead","get","get","addAtTail","addAtHead","addAtHead","addAtTail","addAtTail","get","addAtTail"]
[[],[8],[1],[81],[2],[26],[2],[1],[24],[15],[0],[13],[1],[6,33],[6],[2,91],[82],[6],[4,11],[3],[7,14],[1],[6],[99],[11],[7],[5],[92],[7,92],[57],[2],[6],[39],[51],[3],[22],[5,26],[9,52],[69],[5,58],[79],[7],[41],[33],[88],[44],[8],[72],[93],[18],[1],[9],[46],[9],[92],[71],[69],[11,54],[27],[83],[12],[20],[19,97],[77],[36],[3],[35],[16,68],[22],[36],[17],[62],[89],[61],[6],[92],[28,69],[23],[28],[7,4],[0],[24],[52],[1],[23,3],[7],[6],[68],[79],[45,90],[41,52],[28],[25],[9],[32],[11],[90],[24],[98],[36],[34],[26]]
     */

    /*
    ["MyLinkedList","addAtHead","addAtHead","deleteAtIndex","addAtIndex","addAtHead","addAtHead","addAtHead","get","addAtTail","addAtIndex","addAtHead"]
[[],[5],[2],[1],[1,9],[4],[9],[8],[3],[1],[3,6],[3]]

    * */
    public static void main(String[] args) {

        //test delete of 1
        //test delete head
        //test delete tail
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(5);
        obj.deleteAtIndex(0);


        test01();
    }

    private static void test01() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(5);
        obj.addAtHead(2);
        obj.deleteAtIndex(1);
        obj.addAtIndex(1, 9);
        obj.addAtHead(4);
        obj.addAtHead(9);
        obj.addAtHead(8);
        obj.get(3);
        obj.addAtTail(1);
        obj.addAtIndex(3, 6);
        obj.addAtHead(3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyLinkedList{");
        Node iterator = head;
        while (iterator != null) {
            sb.append(iterator.val);
            if (iterator.next != null) {
                sb.append(", ");
            }
            iterator = iterator.next;
        }
        return sb.append("}").toString();
    }
}

