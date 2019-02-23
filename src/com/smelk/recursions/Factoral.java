package com.smelk.recursions;

public class Factoral {

    public static void main(String[] args) {
        System.out.println(findFactoral(4));
    }

    public static int findFactoral (int value) {

        return (value == 1 ? 1 : value * findFactoral(value - 1));
    }
}