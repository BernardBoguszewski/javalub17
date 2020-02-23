package com.example.demo;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GreetingsTest {

    @Test
    public void testShouldReturnGreetingForName() {
        //given
        String name = "Adam";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, Adam", result);

    }

    @Test
    public void testShouldReturnGreetingWithoutName() {
        //given
        String name = null;
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu", result);

    }

    @Test
    public void testShouldReturnGreetingWithBigCharsInName() {
        //given
        String name = "ADAM";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ, ADAM", result);

    }

    @Test
    public void testShouldReturnGreetingforTwoNames() {
        //given
        String name = "Adam,Maciek";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Maciek, witajcie!", result);

    }

    @Test
    public void testShouldReturnGreetingforMoreThanTwoNames() {
        //given
        String name = "Adam,Maciek,Witek";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witek, Adam i Maciek, witajcie!", result);

    }

    @Test
    public void testShouldReturnGreetingforMoreThanTwoNamesWithWitekToUpperCase() {
        //given
        String name = "Adam,Maciek,WITEK";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Maciek, witajcie! WITAJ, WITEK", result);

    }

    @Test
    public void testShouldReturnGreetingforMoreThanTwoNamesWithMaciekToUpperCase() {
        //given
        String name = "Adam,MACIEK,Witek";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Witek, witajcie! WITAJ, MACIEK", result);

    }

    @Test
    public void testShouldReturnGreetingforMoreThanTwoNamesWithAdamToUpperCase() {
        //given
        String name = "ADAM,Maciek,Witek";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Maciek i Witek, witajcie! WITAJ, ADAM", result);

    }

    @Test
    public void testShouldReturnGreetingforNumber() {
        //given
        String name = "123";
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Z liczbami się nie witam.", result);

    }


}