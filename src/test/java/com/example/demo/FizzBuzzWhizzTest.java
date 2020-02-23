package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzWhizzTest {

    @Test
    void shouldReturnResponseForNull(){
        //given
        Integer digit = null;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        //then
        assertEquals("Nie dla null!", result);
    }

    @Test
    void shouldReturnResponseForDigitDivisibleInto3(){
        //given
        Integer digit = 15;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        //then
        assertEquals("Fizz", result);
    }

}