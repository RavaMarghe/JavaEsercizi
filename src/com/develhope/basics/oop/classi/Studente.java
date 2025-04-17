/*
 * Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome,
 * cognome e identificativo.
 *
 * Per questa classe saranno necessari i metodi accessori (getters e setters) e un costruttore.
 *
 *  Nel main dichiarare un oggetto di tipo Studente.
 * */

package com.develhope.basics.oop.classi;

public class Studente {
    public static void main(String[] args) {
        // Creo un' istanza della classe Studente
        Studente sheldon = new Studente("Sheldon", "Cooper", 36975);

        System.out.println(sheldon);
    }

    // Proprietà
    private String nome;
    private String cognome;
    private int id;

    // Costruttore
    public Studente(String nome, String cognome, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id=" + id +
                '}';
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getId() {
        return id;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setId(int id) {
        this.id = id;
    }
}
