package com.develhope.advance.designPatterns.builder;

public class PersonBuilder {
    private final String firstName;
    private final String lastName;
    private int age;
    private String address;

    // Costruttore obbligatorio per firstName e lastName
    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    // Metodo per impostare l'età - opzionale
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    // Metodo per impostare l'indirizzo - opzionale
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    // Creo un oggetto persona con i dati raccolti
    public Person build() {
        return new Person(this);
    }

    // Getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
