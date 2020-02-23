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
    void testShouldReturnGreetingForNull() {
        //given
        String name = null;
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);


    }

    @Test
    void testShouldReturnGreetingForNameUpperCase() {
        //given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ, "+name, result);

    }

    @Test
    void testShouldReturnGreetingForTwoNames() {
        //given
        String name = "Adam, Grażynka";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Grażynka", result);

    }

    @Test
    void testShouldReturnGreetingForThreeNames() {
        //given
        String name = "Adam,    Grażynka,     Juve";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam, Grażynka i Juve", result);

    }
}