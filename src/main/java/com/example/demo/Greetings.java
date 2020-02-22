package com.example.demo;

public class Greetings {

    private final String greet = "Witaj, ";
    private final String greetForUnknown = "Witaj, mój przyjacielu";


    public String greet(String name) {
        if (name != null) {
            if (isExistAllBigChars(name)) {
                String greetToUpperCase = greet.toUpperCase();
                return greetToUpperCase + name;
            }
            return greet + name;
        } else {
            return greetForUnknown;
        }
    }

    private boolean isExistAllBigChars(String name) {
        return name.equals(name.toUpperCase());
    }
}
