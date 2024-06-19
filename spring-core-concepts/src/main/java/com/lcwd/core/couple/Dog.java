package com.lcwd.core.couple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal {
    @Override
    public void play() {
        System.out.println("Dog is playing...");
    }
}
