/*
 * Scrivere una funzione che controlli se un numero int è in un determinato range.
 * Se lo, è ritorna true. Se non lo è, lancia un'eccezione.
 */

package com.develhope.advance.exceptions;

public class ExceptionUno {
    // Metodo per determinare se il numero è nel range
    public static boolean controlloRange(int numero) {
        if (numero >= 0 && numero < 18) {
            return true;
        } else {

            throw new ArithmeticException("Il numero inserito è fuori dal range 0-18");
        }
    }

    public static void main(String[] args) {
        //
        try {
            int numero = 20;
            if (controlloRange(numero)) {
                System.out.println("Il numero " + numero + " è nel range");
            }

        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e);
        }
    }
}