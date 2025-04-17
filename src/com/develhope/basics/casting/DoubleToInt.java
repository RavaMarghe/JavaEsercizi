/*
 * Scrivere uno snippet di codice che dati 2 numeri con la virgola (double) li sommi e li stampi senza virgola (int).
 * */

package com.develhope.basics.casting;

public class DoubleToInt {
    public static void main(String[] args) {
        double num1 = 8.5;
        double num2 = 13.4;
        int sum = (int) num1 + (int) num2;

        System.out.println(sum);
    }
}