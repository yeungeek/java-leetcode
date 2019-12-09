package com.yeungeek.algo._09_queue;

public class LinkedQueue {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);

        System.out.println(queue.dequeue().val);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue().val);
        System.out.println(queue.dequeue().val);
        System.out.println(queue.dequeue().val);
    }

    //
    private ListNode head;
    private ListNode tail;

    public boolean enqueue(final int value) {
        ListNode newNode = new ListNode(value);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }

        return true;
    }

    public ListNode dequeue() {
        if (head == null) {
            return null;
        }

        ListNode node = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return node;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ListNode listNode = (ListNode) o;

            if (val != listNode.val) return false;
            return next != null ? next.equals(listNode.next) : listNode.next == null;
        }

        @Override
        public int hashCode() {
            int result = val;
            result = 31 * result + (next != null ? next.hashCode() : 0);
            return result;
        }
    }
}
