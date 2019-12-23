package com.yeungeek.algo._10_sorts;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 3, 2, 1};
        SelectSort sort = new SelectSort();
        int[] sortArray = sort.selectSort(array);
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
    }

    public int[] selectSort(int[] array) {
        if (null == array || array.length == 0) {
            return null;
        }

        int count = array.length;

        for (int i = 0; i < count; i++) {
            //min
            int min = i;
            for (int j = i + 1; j < count; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        return array;
    }
}
