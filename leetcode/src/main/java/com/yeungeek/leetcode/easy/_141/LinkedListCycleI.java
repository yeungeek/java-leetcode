package com.yeungeek.leetcode.easy._141;


import com.yeungeek.leetcode.medium._142.LinkedListCycleII;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleI {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode f = new ListNode(2);
        ListNode s = new ListNode(0);
        ListNode t = new ListNode(-4);
        head.next = f;
        f.next = s;
        s.next = t;
        t.next = f;

        System.out.println(new LinkedListCycleI().hasCycle(head));
    }

//    public boolean hasCycle(ListNode head) {
//        Set<ListNode> hash = new HashSet<>();
//        while (null != head) {
//            if (hash.contains(head)) {
//                return true;
//            } else {
//                hash.add(head);
//                head = head.next;
//            }
//        }
//        return false;
//    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static class ListNode {
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

            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return val;
        }
    }
}
