package com.smelk.recursions;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(findFibonacci(25));
    }

    public static int findFibonacci(int value) {
        if (value == 0 || value == 1) return value;
        return findFibonacci(value - 1) + findFibonacci(value - 2);
    }
}