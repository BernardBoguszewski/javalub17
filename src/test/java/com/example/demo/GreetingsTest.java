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
    void testShouldReturnGreetingWithoutName() {
        //given
        String name = null;
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);

    }

    @Test
    void testShouldReturnGreetingWithBigCharsInName() {
        //given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ, ADAM", result);

    }

    @Test
    void testShouldReturnGreetingforTwoNames() {
        //given
        String name = "Adam,Maciek";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Maciek, witajcie!", result);

    }

    @Test
    void testShouldReturnGreetingforMoreThanTwoNames() {
        //given
        String name = "Adam,Maciek,Witek";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witek, Adam i Maciek, witajcie!", result);

    }


}