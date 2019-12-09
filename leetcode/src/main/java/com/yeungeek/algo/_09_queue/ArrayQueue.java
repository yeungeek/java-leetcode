package com.yeungeek.algo._09_queue;

public class ArrayQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(10);
        System.out.println(queue.dequeue());
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);


        System.out.println(queue.dequeue());
        //exception
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
    }

    //array
    private int[] arrays;
    private int count;

    //dequeue
    private int head;
    //enqueue
    private int tail = 0;

    public ArrayQueue(final int count) {
        this.count = count;
        this.arrays = new int[count];
    }

    public boolean enqueue(final int value) {
        if (tail == count) {
            // tail
            if (head == 0) {
                //full
                return false;
            }

            for (int i = head; i < tail; i++) {
                arrays[i - head] = arrays[i];
            }

            //reset head
            tail -= head;
            head = 0;
        }

        arrays[tail] = value;
        tail++;
        return true;
    }

    public int dequeue() {
        if (head == tail) {
            throw new RuntimeException("array is null");
        }

        int value = arrays[head];
        head++;
        return value;
    }
}
