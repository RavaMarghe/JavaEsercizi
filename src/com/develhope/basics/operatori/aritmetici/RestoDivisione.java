/*
 * Definisci un metodo che restituisca il resto della divisione di due numeri interi e stampalo a schermo.

 * */

package com.develhope.basics.operatori.aritmetici;

public class RestoDivisione {
    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 12;
        int risultato = restoDivisione(num1, num2);

        System.out.println("Il resto della divisione è: " + risultato);
    }

    // calcola il resto della divisione tra due interi utilizzando l'operatore modulo (%)
    public static int restoDivisione(int a, int b) {
        return a % b;
    }
}
