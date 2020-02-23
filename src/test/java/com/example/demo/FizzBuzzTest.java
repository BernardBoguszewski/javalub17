package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzForNull() {
        //given
        Integer number = null;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.FizzBuzz(null);

        //then
        assertEquals("Nie dla null!", result);
    }

    @Test
    void fizzBuzzForModulo3() {
        //given
        Integer number = 12;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.FizzBuzz(number);

        //then
        assertEquals("Fizz", result);
    }
    @Test
    void fizzBuzzForModulo5() {
        //given
        Integer number = 20;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.FizzBuzz(number);

        //then
        assertEquals("Buzz", result);
    }
    @Test
    void fizzBuzzFor3and5() {
        //given
        Integer number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.FizzBuzz(number);

        //then
        assertEquals("FizzBuzz", result);
    }
    @Test
    void fizzBuzzfor3() {
        //given
        Integer number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.FizzBuzz(number);

        //then
        assertEquals("FizzWhizz", result);
    }
    @Test
    void fizzBuzzfor5() {
        //given
        Integer number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.FizzBuzz(number);

        //then
        assertEquals("BuzzWhizz", result);
    }
    @Test
    void fizzBuzzforPrimeNumber() {
        //given
        Integer number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.FizzBuzz(number);

        //then
        assertEquals("Whizz", result);
    }
}
