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
        // given
        String name = null;
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    void testShouldReturnUppercaseGreetingForUppercaseName() {
        // given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("WITAJ ADAM!", result);
    }

    @Test
    void testShouldReturnGreetingForTwoNames() {
        // given
        String name = "Adam,Iza";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    void testShouldReturnGreetingForThreeNames() {
        // given
        String name = "Adam,Iza,Robert";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    void testShouldReturnGreetingForTwoLowercaseNamesAndOneUppercaseName() {
        // given
        String name = "Adam,Iza,ROBERT";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);

    }

}