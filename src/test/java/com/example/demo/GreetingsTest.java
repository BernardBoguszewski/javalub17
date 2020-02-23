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

    @Test
    void testShouldReturnGreetingForNames() {
        //given
        String name="Adam,Ewa";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, Adam i Ewa",  result);
    }
    @Test
    void testShouldReturnGreetingForThreeNames() {
        //given
        String name="Adam,Ewa,Robert";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam, Ewa i Robert witajcie!",  result);
    }
    @Test
    void testShouldReturnGreetingForThreeNamesAndUpperCase() {
        //given
        String name="Adam,Ewa,ROBERT";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam, Ewa witajcie! WITAJ ROBERT",  result);
    }

    @Test
    void testShouldReturnGreetingForNumbers() {
        //given
        String name="Adam5";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Z liczbami się nie witam!",  result);
    }


}