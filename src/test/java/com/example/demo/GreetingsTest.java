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
    void testShouldReturnGreetingForNullName() {
        //given
        String name = null;
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    void testShouldReturnUpperCaseGreetingName() {
        //given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ ADAM", result);
    }

    @Test
    void testShouldDivideNamesWhenTwoNamesGivenWithComa() {
        //given
        String name = "Adam,Iza";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    void testShouldGreetingWhenThreeNameGiven() {
        //given
        String name = "Adam,Iza,Robert";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }
}