package com.yeungeek.leetcode.easy._206;

public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printlnNode(head);
        System.out.println("========");
        printlnNode(new ReverseLinkedList().reverseList(head));
    }

    private static void printlnNode(ListNode head) {
        ListNode node = head;
        while (null != node) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (null != curr) {
            ListNode tempNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNode;
        }

        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }
}
