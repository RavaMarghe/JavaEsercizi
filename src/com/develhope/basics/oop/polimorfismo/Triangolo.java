package com.develhope.basics.oop.polimorfismo;

public class Triangolo extends Forma {
    // Proprietà
    private final double base;
    private final double altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcoloArea() {
        double area = (base * altezza) / 2;
        System.out.println("L'area del triangolo è: " + area);
    }
}
