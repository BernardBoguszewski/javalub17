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
    void testShouldReturnUpperCaseName() {
        //given
        String name = "ADAM";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greetUpper(name);
        //then
        assertEquals("WITAJ ADAM!", result);
    }

    @Test
    void testShouldReturnTwoNames(){
        //given
        String name = "Adam i Iza";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greetTwo(name);
        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    void testShouldReturnThreeNames(){
        //given
        String name = "Adam, Iza i Robert";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greetThree(name);
        //then
        assertEquals("Adam, Iza i Robert witajcie!", result);
    }

}