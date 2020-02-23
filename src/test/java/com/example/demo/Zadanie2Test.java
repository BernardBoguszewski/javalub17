package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Zadanie2Test {

    @Test
    void nawiasy() {
        //given
        String text = "[[][][]]";
        Nawiasy zadanie = new Nawiasy();


        //when
       Boolean result = zadanie.Nawiasy(text);

        //then
        assertEquals(true,  result);
    }
}