package org.example;

public class Dog extends Animal implements Pet {
    public String color;

    public Dog(String name, int age, AnimalType type, String habitat) {
        super(name, age, type, habitat);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println("woof");
    }

    public void playWith() {
        System.out.println("Im playing with bone");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

