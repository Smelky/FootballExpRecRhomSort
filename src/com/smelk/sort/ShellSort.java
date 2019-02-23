package com.smelk.sort;

public class ShellSort {

    public static void main(String[] args) {

        int[] arrayForSort = new int[1_000_000];

        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) Math.round(Math.random() * 1_000_000);
        }
        long timeBefore = System.currentTimeMillis();
        shellSort(arrayForSort);
        long timeAfter = System.currentTimeMillis() - timeBefore;
        System.out.println("Lead time: " + timeAfter); // Lead time: 280 ms
    }

    public static void shellSort(int[] arrayForSort) {
        int h = 1;
        int n = arrayForSort.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < arrayForSort.length; i++) {
                for (int j = i; j >= h && arrayForSort[j] > arrayForSort[j - h]; j -= h) {
                    int temp = arrayForSort[j];
                    arrayForSort[j] = arrayForSort[j - h];
                    arrayForSort[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }
}