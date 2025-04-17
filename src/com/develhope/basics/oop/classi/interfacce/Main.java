/*
 * Scrivere un programma che contenga una interfaccia Forma e un metodo chiamato calcolaArea().
 * Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma e implementano il metodo
 * per il calcolo dell'area.
 * */

package com.develhope.basics.oop.classi.interfacce;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(4.3, 2.7);
        Triangolo triangolo = new Triangolo(6, 2.5);

        rettangolo.calcoloArea();
        triangolo.calcoloArea();
    }
}
