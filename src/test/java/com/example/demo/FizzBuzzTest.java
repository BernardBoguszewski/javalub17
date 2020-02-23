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
}
