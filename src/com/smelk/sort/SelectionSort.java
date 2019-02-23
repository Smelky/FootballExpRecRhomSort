package com.smelk.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        long timeBefore = System.currentTimeMillis();
        int[] arrayForSort = new int[1_000_000];

        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) Math.round(Math.random() * 1_000_000);
        }

        selectionSort(arrayForSort);
        long timeAfter = System.currentTimeMillis() - timeBefore;
        System.out.println("Lead time: " + timeAfter); // Lead time: 377990 ms

    }

    public static void selectionSort(int[] arrayForSort) {
        for(int i = 0; i < arrayForSort.length; i++) {

            int min = arrayForSort[i];
            int min_i = i;

            for (int j = i + 1; j < arrayForSort.length; j++) {

                if (arrayForSort[j] < min) {
                    min = arrayForSort[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arrayForSort[i];
                arrayForSort[i] = arrayForSort[min_i];
                arrayForSort[min_i] = tmp;
            }
        }
    }
}