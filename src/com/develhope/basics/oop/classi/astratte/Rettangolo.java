package com.develhope.basics.oop.classi.astratte;

public class Rettangolo extends Forma {
    // Proprietà
    private double base;
    private double altezza;

    // Costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo calcoloArea()
    @Override
    public void calcoloArea() {
        System.out.println("L'area del rettangolo è: " + (base * altezza));
    }

}
