package com.example.demo;

public class Greetings {

    public String greet(String name) {

        if (name != null && !name.isEmpty()) {
            return "Witaj, " + name;
        } else {
            return "Witaj, mój przyjacielu";
        }
    }
}
