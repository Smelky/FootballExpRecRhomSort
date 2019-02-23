package com.smelk.sort;

public class BubbleSort {
    public static void main(String[] args) {
        long timeBefore = System.currentTimeMillis();
        int[] arrayForSort = new int[1_000_000];

        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) Math.round(Math.random() * 1_000_000);
        }

        bubblesort(arrayForSort);
        long timeAfter = System.currentTimeMillis() - timeBefore;
        System.out.println("Lead time: " + timeAfter); // Lead time: 1753925 ms

    }


    public static void bubblesort(int[] arrayForSort) {
        for (int i = 0; i < arrayForSort.length - 1; i++)
            for (int j = 0; j < arrayForSort.length - i - 1; j++)
                if (arrayForSort[j] > arrayForSort[j + 1]) {
                    int temp = arrayForSort[j];
                    arrayForSort[j] = arrayForSort[j + 1];
                    arrayForSort[j + 1] = temp;
                }
    }
}