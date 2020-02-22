package com.example.demo;

public class Greetings {

    public String greet(String name) {
        if (name != null) {
            return "Witaj, " + name;
        } else
            return "Witaj, mój przyjacielu";
    }

    public String greetUpper(String name) {
        String nameUpper = name.toUpperCase();
        return "WITAJ " + nameUpper +"!";
    }
}
