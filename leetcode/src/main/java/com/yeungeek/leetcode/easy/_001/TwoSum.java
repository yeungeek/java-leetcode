package com.yeungeek.leetcode.easy._001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("TwoSum");
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            if (null != value) {
                return new int[]{value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
