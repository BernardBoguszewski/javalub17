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
    void testShouldReturnWhenNameIsNull() {

        //given
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(null);

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    void testShouldReturnCapitalLetters() {

        //given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ, ADAM", result);
    }

    @Test
    void testShouldReturnTwoNames() {
        //given
        String name = "Adam,Ewa";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Ewa, witajcie!", result);
    }

    @Test
    void testShouldReturnThreeNames() {
        //given
        String name = "Adam,Ewa,Szatan";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam, Ewa i Szatan, witajcie!", result);
    }

    @Test
    void testShouldReturnThreeNamesWithOneInCapitalLetters() {
        //given
        String name = "Adam,EWA,Szatan";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Szatan, witajcie! WITAJ EWA!", result);
    }
}

