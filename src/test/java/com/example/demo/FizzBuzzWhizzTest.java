package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzWhizzTest {

    @Test
    void testShouldReturnMessegeForNull() {
        // given
        Integer digit = null;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        // then
        assertEquals("Nie dla null!", result);
    }

    @Test
    void testShouldReturnFizzForNumberDivisibleByThree() {
        // given
        Integer digit = 6;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        // then
        assertEquals("Fizz", result);
    }

    @Test
    void testShouldReturnBuzzForNumberDivisibleByFive() {
        // given
        Integer digit = 10;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        // then
        assertEquals("Buzz", result);
    }

    @Test
    void testShouldReturnFizzBuzzForNumberDivisibleByThreeAndFive() {
        // given
        Integer digit = 15;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        // then
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testShouldReturnWhizzForPrimeNumbers() {
        // given
        Integer digit = 7;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        // then
        assertEquals("Whizz", result);
    }

    @Test
    void testShouldReturnFizzWhizzForThree() {
        // given
        Integer digit = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        // then
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testShoultReturnBuzzWhizzForFive() {
        // given
        Integer digit = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        // then
        assertEquals("BuzzWhizz", result);
    }

}