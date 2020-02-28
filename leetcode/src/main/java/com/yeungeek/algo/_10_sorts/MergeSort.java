package com.yeungeek.algo._10_sorts;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{11, 8, 3, 5, 9, 7, 1, 2, 5};

        MergeSort sort = new MergeSort();
        sort.mergeSort(array);

        for (int v : array) {
            System.out.println(v);
        }
    }

    public void mergeSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        mergeSortRecursive(array, 0, array.length - 1);
    }

    public void mergeSortRecursive(int[] array, int p, int r) {
        if (p >= r) {
            return;
        }

        int q = p + (r - p) / 2;
        mergeSortRecursive(array, p, q);
        mergeSortRecursive(array, q + 1, r);

        //merge
//        merge(array, p, q, r);
        mergeBySentry(array, p, q, r);
    }

    private void merge(int[] array, int p, int q, int r) {
        //
        int i = p;
        int j = q + 1;
        int[] temp = new int[r - p + 1];
        int k = 0;

        while (i <= q && j <= r) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        while (start <= end) {
            temp[k++] = array[start++];
        }

        //copy
        for (i = 0; i <= r - p; i++) {
            array[p + i] = temp[i];
        }
    }

    private void mergeBySentry(int[] array, int p, int q, int r) {
        int[] left = new int[q - p + 2]; //+1 for sentry
        int[] right = new int[r - q + 1];

        for (int i = 0; i <= q - p; i++) {
            left[i] = array[p + i];
        }

        //add left sentry
        left[q - p + 1] = Integer.MAX_VALUE;

        for (int i = 0; i < r - q; i++) {
            right[i] = array[q + i + 1];
        }

        //add right sentry
        right[r - q] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        int k = p;
        while (k <= r) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
    }
}
