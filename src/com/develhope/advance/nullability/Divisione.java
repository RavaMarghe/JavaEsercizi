/*
 * Scrivere una funzione che accetti in input un numeratore e un denominatore
 *
 * Controlli che il numeratore e il denominatore non siano null
 *
 * Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
 * */

package com.develhope.advance.nullability;

public class Divisione {
    // Funzione che controlla il null e fa la divisione
    public static double dividi(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("Il numeratore ed il denominatore devono essere diversi da null");
        }
        return (double) numeratore / denominatore;
    }

    public static void main(String[] args) {
        // Input valido
        try {
            double risultato = dividi(10, 2);
            System.out.println("Risultato 1: " + risultato);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Denominatore null
        try {
            double risultato = dividi(10, null);
            System.out.println("Risultato 2: " + risultato);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
