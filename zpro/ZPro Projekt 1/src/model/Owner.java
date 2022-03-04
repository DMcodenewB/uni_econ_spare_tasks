package model;

/*
 * Klasa Owner - właściciel konta.
 */

public class Owner {

    private String name;
    private String surname;

    public Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return name + " " + surname;
    }
}
