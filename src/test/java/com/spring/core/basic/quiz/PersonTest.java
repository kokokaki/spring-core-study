package com.spring.core.basic.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void personTest() {

        Person kim = Person.getInstance();
        Person park = Person.getInstance();
        Person park2 = Person.getInstance();
        Person park3 = Person.getInstance();
        Person park4 = Person.getInstance();
        Person park5 = Person.getInstance();

        System.out.println(kim);
        System.out.println(park);
        System.out.println(park2);
        System.out.println(park3);
        System.out.println(park4);
        System.out.println(park5);
    }

}