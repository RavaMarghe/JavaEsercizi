/*
 * A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area, aggiungere una ulteriore
 * classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura
 * */

package com.develhope.basics.oop.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(3.5, 7);
        Triangolo triangolo = new Triangolo(4, 6.25);

        forma.calcoloArea();
        rettangolo.calcoloArea();
        triangolo.calcoloArea();
    }
}
