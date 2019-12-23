package com.yeungeek.leetcode.easy._703;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, arr);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }

    private PriorityQueue<Integer> mQueue;
    private int mIndex;

    public KthLargest(int k, int[] nums) {
        this.mIndex = k;
        this.mQueue = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        int size = mQueue.size();
        if (size < mIndex) {
            mQueue.add(val);
        } else {
            if (mQueue.peek() < val) {
                mQueue.poll();
                mQueue.add(val);
            }
        }

        return mQueue.peek();
    }
}
