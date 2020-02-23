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

    @Test
    void testShouldGreetingThreeNamesWhenNo3Upper() {
        //given
        String name = "Adam,Iza,ROBERT";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Aam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    void testShouldGreetingThreeNamesWhenNo2Upper() {
        //given
        String name = "Adam,IZA,Robert";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam i Robert, witajcie! WITAJ IZA!", result);
    }

    @Test
    void testShouldGreetingThreeNamesWhenNo1Upper() {
        //given
        String name = "ADAM,Iza,Robert";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Iza i Robert, witajcie! WITAJ ADAM!", result);
    }

    @Test
    void testShouldNoGreetingWhenNameContainNumber(){
        //giver
        String name = "Adam,2,Robert";
        Greetings greetings = new Greetings();
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Z liczbami się nie witam!", result);
    }
}