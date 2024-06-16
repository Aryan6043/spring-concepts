package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired // Field injection is not recommended but just for an example
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
