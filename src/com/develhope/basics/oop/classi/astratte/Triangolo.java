package com.develhope.basics.oop.classi.astratte;

public class Triangolo extends Forma {
    // Proprietà
    private double base;
    private double altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo calcoloArea()
    @Override
    public void calcoloArea() {
        System.out.println("L'area del triangolo è: " + ((base * altezza) / 2));
    }
}
