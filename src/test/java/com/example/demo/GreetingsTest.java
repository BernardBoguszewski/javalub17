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
    void testShouldReturnGreetingWithNull() {
        //given
        String name = null;
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);


    }
    @Test
    void testShouldReturnNameWithBigLetter() {
        //given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, Adam", result);


    }


    @Test
    void testShouldReturnNameWithDecimal() {
        //given
        String name = "Adam, Iza";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    void testShouldReturn() {
        //given
        String name = "Adam, Iza";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

}

