package com.smelk.rhombus;

public class Rhombus {

    public static void main(String[] args) {

        rhombus(5);
    }

    public static void rhombus(int size) {
        String star = "";
        String tab = "";

        for (int i = 0; i <= size; i++) {
            tab = tab + "  ";
        }

        for (int i = 0; i < size; i++) {
            star = star + "**";
            System.out.println(tab + star);
            try {
                tab = tab.substring(0, i) + tab.substring(i + 1);
            } catch (Exception e) {
                break;
            }

        }
        tab = tab + " ";

        for (int i = size; i > 0; i--) {
            tab = tab + " ";
            try {
                star = star.substring(0, i) + star.substring(i + 2);
            } catch (Exception e) {
                break;
            }
            System.out.println(tab + star);
        }
    }
}