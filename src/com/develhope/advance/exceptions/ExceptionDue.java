/*
 * Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.
 * */

package com.develhope.advance.exceptions;

public class ExceptionDue {
    // Metodo che controlla se un carattere è un numero
    public static boolean controlloNumeri(char carattere) {
        if (carattere >= '0' && carattere <= '9') {
            return true;
        } else {
            throw new IllegalArgumentException("Errore: il carattere '" + carattere + "' non è un numero");
        }

    }

    public static void main(String[] args) {
        String stringa = "12 ciao 34";

        // Ciclo la stringa per controllare i singoli caratteri
        for (int i = 0; i < stringa.length(); i++) {
            try {
                if (controlloNumeri(stringa.charAt(i))) {
                    System.out.println("Il carattere inserito è il numero: " + stringa.charAt(i));
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
