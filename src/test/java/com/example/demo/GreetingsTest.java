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
    void testShouldReturnNotNull() {
        // given
        String name = null;
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Witaj, mój przyjacielu", result);

    }

    @Test
    void testShouldReturnUpperCase() {
        // given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("WITAJ ADAM", result);
    }

    @Test
    void testShouldReturnChange() {
        // given
        String name = "Adam , Iza";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    void ShouldReturnGreetingsForThreeNames() {
        // given
        String name = "Adam, Iza , Robert";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    void ShouldReturnThirdUpperName() {
        // given
        String name = "Adam, Iza, ROBERT";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    void ShouldReturnSecondUpperName() {
        // given
        String name = "Adam, IZA, Robert";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals("Adam i Robert, witajcie! WITAJ IZA!", result);
    }

    @Test
    void ShouldReturnFirstUpperName() {
        // given
        String name = "ADAM, Iza, Robert";
        Greetings greetings = new Greetings();

        // when
        String result = greetings.greet(name);

        // then
        assertEquals(" Iza i Robert, witajcie! WITAJ ADAM!", result);
    }
}