package com.example.demo;

public class Greetings {

    public String greet(String name) {

        if (name == null) {
            name = "mój przyjacielu";
        }
            return "Witaj, " + name;
        }
    }
