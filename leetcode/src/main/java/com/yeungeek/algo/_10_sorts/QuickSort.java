package com.yeungeek.algo._10_sorts;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 11, 3, 9, 8};
        QuickSort sort = new QuickSort();
        sort.quickSort(array);

        for (int v : array) {
            System.out.println(v);
        }
    }

    public void quickSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        quickSortRecursive(array, 0, array.length - 1);
    }

    public void quickSortRecursive(final int[] array, int p, int r) {
        if (p >= r) {
            return;
        }

        int q = partition(array, p, r);
        //q - 1
        quickSortRecursive(array, p, q - 1);
        quickSortRecursive(array, q + 1, r);
    }

    private int partition(final int[] array, final int p, final int r) {
        int pivot = array[r];
        int i = p;

        for (int j = p; j < r; j++) {
            if (array[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    int tmp = array[i];
                    array[i++] = array[j];
                    array[j] = tmp;
                }
            }
        }

        //last pivot
        int tmp = array[i];
        array[i] = array[r];
        array[r] = tmp;
        return i;
    }
}
