package com.develhope.basics.oop.classi.enums;

public class Rettangolo extends Forma {
    // Proprietà
    private final double base;
    private final double altezza;

    // Costruttore
    public Rettangolo(double base, double altezza) {
        this.tipo = TipoForma.RETTANGOLO;
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcoloArea() {
        System.out.println("L'area del rettangolo è: " + (base * altezza));
    }
}

