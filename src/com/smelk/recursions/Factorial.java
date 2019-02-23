package com.smelk.recursions;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(findFactorial(0));
    }

    public static int findFactorial (int value) {

        return (value == 1 || value == 0 ? 1 : value * findFactorial(value - 1));
    }
}