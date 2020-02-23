package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketTest {

    @Test
    void testShouldReturnIfAllBracketsAreClosed1() {

        //given
        String bracketsString = "[]";
        Brackets brackets = new Brackets();

        //when
        boolean result = brackets.isPaired(bracketsString);

        //then
        assertEquals(true, result);

    }

    @Test
    void testShouldReturnIfAllBracketsAreClosed2() {

        //given
        String bracketsString = "[][][[[]]]";
        Brackets brackets = new Brackets();

        //when
        boolean result = brackets.isPaired(bracketsString);

        //then
        assertEquals(true, result);

    }

    @Test
    void testShouldReturnIfAllBracketsAreClosed3() {

        //given
        String bracketsString = "[]][[]";
        Brackets brackets = new Brackets();

        //when
        boolean result = brackets.isPaired(bracketsString);

        //then
        assertEquals(false, result);

    }

    @Test
    void testShouldReturnIfAllBracketsAreInProperOrder1() {

        //given
        String bracketsString = "][";
        Brackets brackets = new Brackets();

        //when
        boolean result = brackets.isPaired(bracketsString);

        //then
        assertEquals(false, result);
    }

    @Test
    void testShouldReturnIfAllBracketsAreInProperOrder2() {

        //given
        String bracketsString = "][][][";
        Brackets brackets = new Brackets();

        //when
        boolean result = brackets.isPaired(bracketsString);

        //then
        assertEquals(false, result);
    }
}
