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

}