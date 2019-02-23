package com.smelk.sort;

public class MergeSortInPlace {

    public static void main(String[] args) {

        int[] arrayForSort = new int[1_000_000];

        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) Math.round(Math.random() * 1_000_000);
        }
        int arr_size = arrayForSort.length;

        long timeBefore = System.currentTimeMillis();
        mergeSort(arrayForSort, 0, arr_size - 1);
        long timeAfter = System.currentTimeMillis() - timeBefore;
        System.out.println("Lead time: " + timeAfter); // Lead time: 81032 ms
    }

    private static void merge(int arr[], int start, int mid, int end) {
        int start2 = mid + 1;

        if (arr[mid] <= arr[start2]) {
            return;
        }

        while (start <= mid && start2 <= end) {

            if (arr[start] <= arr[start2]) {
                start++;
            } else {
                int value = arr[start2];
                int index = start2;

                while (index != start) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[start] = value;

                start++;
                mid++;
                start2++;
            }
        }
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}