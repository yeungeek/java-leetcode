package com.yeungeek.algo._08_stack;

public class ArrayStack {
    private String[] items;
    private int n;
    private int count;

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        System.out.println(stack.push("1"));
        System.out.println(stack.push("2"));
        System.out.println(stack.pop());
        System.out.println(stack.push("3"));
        System.out.println(stack.push("4"));
        System.out.println(stack.push("5"));

    }

    public ArrayStack(int n) {
        items = new String[n];
        this.n = n;
    }

    public boolean push(final String value) {
        if (count == n) {
            return false;
        }

        items[count] = value;
        count++;
        return true;
    }

    public String pop() {
        if (count == 0) {
            return null;
        }

        String value = items[count - 1];
        count--;
        return value;
    }
}
