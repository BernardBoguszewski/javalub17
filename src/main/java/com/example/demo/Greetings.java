package com.example.demo;

public class Greetings {

    public String greet(String name) {
        if (name.equals(""))
            return "Witaj, mój przyjacielu";
        else
            return "Witaj, " + name;
    }
}
