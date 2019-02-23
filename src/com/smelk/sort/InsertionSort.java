package com.smelk.sort;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arrayForSort = new int[1_000_000];

        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) Math.round(Math.random() * 1_000_000);
        }

        long timeBefore = System.currentTimeMillis();
        insertionSort(arrayForSort);
        long timeAfter = System.currentTimeMillis() - timeBefore;
        System.out.println("Lead time: " + timeAfter); // Lead time: 92381 ms

    }

    public static void insertionSort(int[] arrayForSort) {
        int key;
        for (int i = 1; i < arrayForSort.length; i++) {
            key = arrayForSort[i];
            int j = i - 1;
            while (j >= 0 && arrayForSort[j] < key) {
                arrayForSort[j + 1] = arrayForSort[j];
                j = j - 1;
            }
            arrayForSort[j + 1] = key;
        }
    }
}