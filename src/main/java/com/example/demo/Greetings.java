package com.example.demo;

public class Greetings {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        }
        if (name == name.toUpperCase()) {
            return "WITAJ " + name;
        }
        else {
            return "Witaj, " + name;
        }
    }
}
