package com.yeungeek.algo._10_sorts;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 3, 2, 1};
        InsertSort sort = new InsertSort();
        int[] insertArray = sort.insertSort(array);
        for (int value : insertArray) {
            System.out.print(value + " ");
        }
    }

    public int[] insertSort(int[] array) {
        if (null == array || array.length == 0) {
            return null;
        }

        int count = array.length;
        if (count <= 1) {
            return array;
        }

        for (int i = 1; i < count; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > value) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }

            array[j + 1] = value;
        }
        return array;
    }
}
