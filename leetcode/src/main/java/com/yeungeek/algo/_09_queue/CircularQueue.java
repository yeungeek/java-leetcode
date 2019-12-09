package com.yeungeek.algo._09_queue;

public class CircularQueue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        System.out.println(queue.dequeue());
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(60);
        queue.enqueue(60);
    }

    //array
    private int[] arrays;
    private int count;

    //dequeue
    private int head;
    //enqueue
    private int tail = 0;

    public CircularQueue(final int count) {
        this.count = count;
        this.arrays = new int[count];
    }

    public boolean enqueue(final int value) {
        int index = (tail + 1) % count;
        if (index == head) {
            //full
            System.out.println("enqueue is full");
            return false;
        }

        arrays[tail] = value;
        tail = index;
        return true;
    }

    public int dequeue() {
        if (head == tail) {
            throw new RuntimeException("array is null");
        }

        int value = arrays[head % count];
        head++;
        return value;
    }
}
