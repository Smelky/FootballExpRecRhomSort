package com.smelk.exponentiation;

public class Exponentiation {

    public static void main(String[] args) {
        System.out.println(raiseToPower(2,5));

    }
    public static int raiseToPower(int value, int exponenta){
        int firstExampleOfValue = value;
        int result;
        for (int i = 1; i < exponenta; i++) {
            value = firstExampleOfValue * value;
        }
        result = value;
        return result;
    }
}