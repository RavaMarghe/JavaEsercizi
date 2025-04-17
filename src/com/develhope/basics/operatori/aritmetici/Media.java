/*
 * Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.
 * */

package com.develhope.basics.operatori.aritmetici;

public class Media {
    public static void main(String[] args) {
        double num1 = 9;
        double num2 = 12;
        double num3 = 5;

        double risultato = media(num1, num2, num3);
        System.out.println("La media è: " + risultato);

    }

    // calcola la media di tre numeri
    public static double media(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}