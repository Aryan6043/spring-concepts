package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired // Field Injection [Highly Readable]
    @Qualifier("mouse")
    Animal animal;

    @Autowired // Constructor Injection [Used for mandatory dependencies]
    public Person(@Qualifier("dog") Animal animal) {
        System.out.println("Constructor called...");
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Autowired // Setter Injection [Used for optional dependencies]
    public void setAnimal(@Qualifier("cat") Animal animal) {
        System.out.println("Setter method called...");
        this.animal = animal;
    }

    public void playWithAnimal() {
        // using animal
        animal.play();
    }
}
