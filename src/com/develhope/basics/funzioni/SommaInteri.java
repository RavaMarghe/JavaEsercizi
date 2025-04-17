/*
 * Definire una funzione che accetti in ingresso 2 interi e ne restituisca la somma.
 * */

package com.develhope.basics.funzioni;

public class SommaInteri {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 13;
        int risultato = somma(num1, num2);

        System.out.println("La somma è: " + risultato);
    }

    // somma di due interi
    public static int somma(int a, int b) {
        return a + b;
    }
}