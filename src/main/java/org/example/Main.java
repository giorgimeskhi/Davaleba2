package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("yursha", 3, AnimalType.MAMMAL, "bark");
        Parrot parrot = new Parrot("koko", 2, AnimalType.BIRD, "talk");

        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog age: " + dog.getAge());
        System.out.println("Dog type: " + dog.getType());
        System.out.println("Dog habitat: " + dog.getHabitat());
        dog.playWith();

        System.out.println("--------");

        System.out.println("Parrot name: " + parrot.getName());
        System.out.println("Parrot age: " + parrot.getAge());
        System.out.println("Parrot type: " + parrot.getType());
        System.out.println("Parrot habitat: " + parrot.getHabitat());
        parrot.fly();
        parrot.talk();
    }
}

