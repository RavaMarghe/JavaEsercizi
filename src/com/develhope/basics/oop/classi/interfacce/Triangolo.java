package com.develhope.basics.oop.classi.interfacce;

public class Triangolo implements Forma {
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
        System.out.println("L'area del triangolo è: " + ((base * altezza) / 2));
    }
}
