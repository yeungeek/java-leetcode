package com.yeungeek.algo._10_sorts;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortArray = bubbleSort.bubbleSort(array);
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
    }

    public int[] bubbleSort(int[] array) {
        if (null == array || array.length == 0) {
            return null;
        }

        int count = array.length;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        return array;
    }

    public int[] bubbleSortFlag(int[] array) {
        if (null == array || array.length == 0) {
            return null;
        }

        int count = array.length;
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }

        return array;
    }
}
