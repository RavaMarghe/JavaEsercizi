/*
 * Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore
 * scelto da te e le moltiplichi fra di loro.
 *
 * Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.
 * */

package com.develhope.basics.operatori.assegnazione;

public class Moltiplicazione {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 3;

        // chiamo il metodo incrementaEMoltiplica() e salvo il risultato
        double risultato = incrementaEMoltiplica(num1, num2);

        System.out.println("Il risultato è: " + risultato);
    }

    // metodo per incrementare due numeri e moltiplicarli
    public static double incrementaEMoltiplica(double a, double b) {
        double incremento = 1.5;

        // incremento le variabili
        a += incremento;
        b += incremento;

        // moltiplico le variabili incrementate
        return a * b;
    }
}

