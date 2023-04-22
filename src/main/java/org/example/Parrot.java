package org.example;

public class Parrot extends Animal implements Bird {
    private String race;

    public Parrot(String name, int age, AnimalType type, String habitat) {
        super(name, age, type, habitat);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void talk() {
        System.out.println("Hello");
    }

    public void fly() {
        System.out.println("Im flying");
    }
}
