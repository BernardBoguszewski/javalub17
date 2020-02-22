package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingsTest {

    @Test
    void testShouldReturnGreetingForName() {
        //given
        String name = "Adam";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, Adam", result);


    }

    @Test
    void greet() {
        //given
        String name = null;
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);

    }
}