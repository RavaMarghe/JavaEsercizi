package com.develhope.basics.oop.classi.enums;

public abstract class Forma {
    // Proprietà
    protected TipoForma tipo;

    // Getter
    public TipoForma getTipo() {
        return tipo;
    }

    // Metodi
    public abstract void calcoloArea();
}
