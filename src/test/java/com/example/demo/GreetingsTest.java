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
        String name=null;
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu",  result);
    }

    @Test
    void testShouldReturnGreetingForUpperCase() {
        //given
        String name="ADAM";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ, ADAM",  result);
    }



}