package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketsTest {

    @Test
    void testShouldReturnTrueForClosedBrackets() {
        // given
        String bracketsSet = "[[[]]]";
        Brackets brackets = new Brackets();

        // when
        boolean result = brackets.checkBrackets(bracketsSet);

        // then
        assertTrue(result);
    }

    @Test
    void testShouldReturnFalseForEmptyString() {
        // given
        String bracketsSet = null;
        Brackets brackets = new Brackets();

        // when
        boolean result = brackets.checkBrackets(bracketsSet);

        // then
        assertFalse(result);
    }

    @Test
    void testShouldReturnFalseForNotClosedBrackets() {
        // given
        String bracketsSet = "[][";
        Brackets brackets = new Brackets();

        // when
        boolean result = brackets.checkBrackets(bracketsSet);

        // then
        assertFalse(result);
    }
}
