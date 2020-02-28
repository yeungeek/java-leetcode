package com.yeungeek.algo._10_sorts;

/**
 * 1. 设置固定数量的桶
 * 2. 把数据放到对应的桶中
 * 3. 对每个不为空的桶中数据进行排序
 * 4. 拼接不为空的桶中数据
 */
public class BucketSort {
    public static void main(String[] args) {

    }

    public int[] bucketSort(final int[] array) {
        return sort(array, 5);
    }

    public int[] sort(final int[] array, final int bucketSize) {
        if (array.length == 0) {
            return array;
        }

        //min and max
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        int bucketCount = (max - min + 1) / bucketSize;
        int[][] buckets = new int[bucketSize][];
        //add to array

        return null;
    }
}
