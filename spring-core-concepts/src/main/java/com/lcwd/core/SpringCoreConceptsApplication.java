package com.lcwd.core;

import com.lcwd.core.couple.Cat;
import com.lcwd.core.couple.Dog;
import com.lcwd.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"in.aryan.core"})
public class SpringCoreConceptsApplication {

    public static void main(String[] args) {

        /*
         * What to tell Spring so that it manages the object creation and connections?
         * 1. Who are the beans?        ==> @Component
         * 2. Who are its dependencies? ==> @Autowired
         * 3. Where to scan for beans?  ==> @ComponentScan
         */

        /*
         * Below method returns a ApplicationContext object.
         * This ApplicationContext object can act as a Spring Container.
         */
        ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
        Person person = context.getBean(Person.class);
        person.playWithAnimal();
    }

}
