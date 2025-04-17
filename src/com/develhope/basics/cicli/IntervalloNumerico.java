/*
 * Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati
 * che vuoi avere e stampi tutti i numeri naturali in ordine inverso (quindi se passo il punto di partenza a 6
 * e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).
 * */

package com.develhope.basics.cicli;

public class IntervalloNumerico {
    public static void main(String[] args) {
        int numero = 16;
        int numeroRisultati = 4;

        calcoloIntervallo(numero, numeroRisultati);
    }

    // Metodo che torna una sequenza di numeri in ordine decrescente, partendo dal numero inserito
    public static void calcoloIntervallo(int numero, int numeroRisultati) {
        for (int i = 0; i < numeroRisultati; i++) {
            System.out.println((numero));
            numero--;
        }
    }
}
