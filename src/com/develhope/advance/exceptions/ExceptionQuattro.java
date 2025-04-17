/*
 * Scrivere una funzione che accetti un array in input e provi a dividere un numero del array per 0 e gestisca
 * sia l'eccezione della divisione che quella di indice non presente nel array, leggendone il messaggio.
 * Eseguire sempre un blocco di codice scrivendo un messaggio in console.
 * */

package com.develhope.advance.exceptions;

public class ExceptionQuattro {
    public static int divisoZero(int[] numeri, int indice) {
        try {
            return numeri[indice] / 0;
        } catch (ArithmeticException e) { // Controllo divisione per 0
            System.out.println("Eccezione: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) { // Controllo validità indice
            System.out.println("Eccezione: " + e.getMessage());
        } finally {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] numeri = {1, 5, 23, 14, 6, 9};

        System.out.println(divisoZero(numeri, 3));
        System.out.println(divisoZero(numeri, 10));

    }
}
