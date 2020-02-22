package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void testShouldReturnGreetingForAnonymous() {
        //given

        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(null);

        //then
        assertEquals("Witaj, mój przyjacielu", result);

    }
}