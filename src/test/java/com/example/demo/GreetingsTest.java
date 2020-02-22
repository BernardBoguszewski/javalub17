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
    void testShouldReturnGreetingForAnonymous() {
        //given

        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(null);

        //then
        assertEquals("Witaj, mój przyjacielu", result);

    }

    @Test
    void testShouldReturnGreetingForBig() {
        //given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ " + name, result);

    }

    @Test
    void testShouldReturnMultipleGreetings() {
        //given
        String name = "Adam,Iza";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie!", result);

    }

    @Test
    void testShouldReturn3Greetings() {
        //given
        String name = "Adam,Iza,Karol";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam, Iza i Karol, witajcie!", result);

    }
}