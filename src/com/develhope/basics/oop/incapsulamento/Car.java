/*
 * Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà
 * cilindrata, targa, marca e modello.
 *
 * Per questa classe saranno necessari i metodi accessori (getters e setters) e un costruttore.
 *
 * Nel main dichiarare un oggetto di tipo Auto.
 * */

package com.develhope.basics.oop.incapsulamento;

public class Car {
    public static void main(String[] args) {
        // Creo un'istanza della classe Auto
        Car auto1 = new Car(5.7, "KAZ2Y5", "Chevrolet", "Impala");

        System.out.println(auto1);
    }

    // Proprietà
    private double cilindrata;
    private String targa;
    private String marca;
    private String modello;

    // Costruttore
    public Car(double cilindrata, String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }

    // Getter
    public double getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }


    // Setter
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}