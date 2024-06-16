package com.lcwd.core.couple;

public class Person {

    Animal animal;

    // injecting animal through constructor
    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal() {
        // using animal
        animal.play();
    }
}
