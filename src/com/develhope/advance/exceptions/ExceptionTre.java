/*
 * Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
 * */

package com.develhope.advance.exceptions;

public class ExceptionTre {
    public static int divisoZero(int numero) {
        try {
            return numero / 0;
        } catch (ArithmeticException e) {
            System.out.println("Eccezione: " + e.getMessage());
            return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println(divisoZero(4));

    }
}

