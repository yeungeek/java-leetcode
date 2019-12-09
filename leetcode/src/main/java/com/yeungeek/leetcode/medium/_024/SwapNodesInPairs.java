package com.yeungeek.leetcode.medium._024;


/**
 * @see <a href='https://juejin.im/post/5da94f6d6fb9a04df10e6ecd'>LinkedList</a>
 */
public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        printlnNode(head);
        System.out.println("result: ");
        printlnNode(new SwapNodesInPairs().swapPairs(head));
    }

    public ListNode swapPairs(ListNode head) {
        ListNode sentry = new ListNode(-1);
        sentry.next = head;
        head = sentry;
        while (head.next != null && head.next.next != null) {
            ListNode t1 = head.next;
            ListNode t2 = t1.next;
            head.next = t2;
            t1.next = t2.next;
            t2.next = t1;
            head = t1;
        }

        return sentry.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    private static void printlnNode(ListNode head) {
        ListNode node = head;
        while (null != node) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
