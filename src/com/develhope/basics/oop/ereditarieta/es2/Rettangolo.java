package com.develhope.basics.oop.ereditarieta.es2;

public class Rettangolo extends Forma {
    // Proprietà
    private final double base;
    private final double altezza;

    // Costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcoloArea() {
        double area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);

    }
}
