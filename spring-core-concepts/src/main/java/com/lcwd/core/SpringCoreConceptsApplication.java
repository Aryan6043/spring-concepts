package com.lcwd.core;

import com.lcwd.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

    public static void main(String[] args) {

        Person person = new Person();
        person.playWithAnimal();
        SpringApplication.run(SpringCoreConceptsApplication.class, args);
    }

}
