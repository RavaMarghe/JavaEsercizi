/*
 * Scrivi un programma che contiene un metodo che dati 2 interi in ingresso e un valore di confronto
 * verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione
 * comprensivo dei due limiti (inferiore e superiore)
 * */

package com.develhope.basics.operatori.logici;

public class IntervalloNumerico {
    public static void main(String[] args) {
        int limiteMinimo = 1;
        int limiteMassimo = 20;
        int valoreDiConfronto = 7;

        // chiamo il metodo
        boolean compresoNellIntervallo = checkCompresoNellIntervallo(limiteMinimo, limiteMassimo, valoreDiConfronto);

        System.out.println("Limite minimo: " + limiteMinimo);
        System.out.println("Limite massimo: " + limiteMassimo);
        System.out.println("Valore di confronto: " + valoreDiConfronto);

        System.out.println("Il valore inserito è compreso nell'intervallo? " + compresoNellIntervallo);
    }

    // metodo che controlla se il valore di confronto fa parte dell'intervallo, utilizzando gli operatori logici
    public static boolean checkCompresoNellIntervallo(int limiteMinimo, int limiteMassimo, int valoreDiConfronto) {
        return limiteMinimo <= valoreDiConfronto && valoreDiConfronto <= limiteMassimo;
    }
}