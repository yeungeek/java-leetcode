package com.yeungeek.leetcode;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello LeetCode");

        Random random = new Random(System.currentTimeMillis());
        System.out.println("random: " + String.valueOf(random.nextInt(10000 - 1000) + 1000));
    }
}
