package com.yeungeek.leetcode.medium._142;

public class LinkedListCycleII {
    public static void main(String[] args) {
//        ListNode head = new ListNode(3);
//        ListNode f = new ListNode(2);
//        ListNode s = new ListNode(0);
//        ListNode t = new ListNode(-4);
//        head.next = f;
//        f.next = s;
//        s.next = t;
//        t.next = f;
        ListNode head = new ListNode(1);
        ListNode f = new ListNode(2);
        head.next = f;
        f.next = head;

        ListNode node = new LinkedListCycleII().detectCycle(head);
    }

//    public ListNode detectCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return null;
//        }
//
//        Map<ListNode, ListNode> map = new HashMap<>();
//        while (null != head) {
//            if (map.containsKey(head)) {
//                return map.get(head);
//            } else {
//                map.put(head, head);
//                head = head.next;
//            }
//        }
//
//        return null;
//    }

    //1. has cycle
    //2. first cycle node
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode pHead = head;
                if (pHead == slow) {
                    return pHead;
                }
                while (pHead != slow) {
                    pHead = pHead.next;
                    slow = slow.next;
                    if (pHead == slow) {
                        return pHead;
                    }
                }
            }
        }

        return null;
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

    private static void printlnNode(ListNode head) {
        System.out.println("result");
        ListNode node = head;
        while (null != node) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
