package com.yeungeek.struct.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int[] nums = new int[32];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        //first,last, index(1-10),return real value
        System.out.println(getPosition(9, 12, 6));
    }

    private static int getPosition(final int first, final int last, final int index) {
        map.clear();
        for (int i = first; i <= last; i++) {
            map.put(i % 10 == 0 ? 10 : i % 10, i);
        }

        if (map.containsKey(index)) {
            return map.get(index);
        }

        int tempValue = 10;
        int closeIndex = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int temp = Math.abs(entry.getKey() - index);
            if (temp < tempValue) {
                tempValue = temp;
                closeIndex = entry.getKey();
            }
        }

        int closedValue = map.get(closeIndex);
        System.out.println("closed value: " + closedValue);

        return closedValue / 10 * 10 + index;
    }
}
