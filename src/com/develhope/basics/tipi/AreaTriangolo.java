/*
 * Scrivere uno snippet di codice che, dato un triangolo identificato da base e altezza, restituisca l'area.
 * */

package com.develhope.basics.tipi;

public class AreaTriangolo {
    public static void main(String[] args) {
        double base = 11d;
        double altezza = 7d;
        double area = base * altezza / 2;

        System.out.println("L'area del triangolo è: " + area);
    }
}