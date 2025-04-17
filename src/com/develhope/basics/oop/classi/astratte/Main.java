/*
 * Scrivere un programma che contenga una classe astratta chiamata Forma e un metodo astratto chiamato calcolaArea().
 * Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma e implementano il metodo per il calcolo
 * dell'area in maniera specifica.
 */

package com.develhope.basics.oop.classi.astratte;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 7.3);
        Triangolo triangolo = new Triangolo(6.2, 8);

        rettangolo.calcoloArea();
        triangolo.calcoloArea();
    }
}
