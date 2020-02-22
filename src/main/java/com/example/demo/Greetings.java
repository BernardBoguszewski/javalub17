package com.example.demo;

public class Greetings {

    public String greet(String name) {


        if (name != null && !name.isEmpty()) {
            boolean hasUpperCase = name.equals(name.toUpperCase());
            if (!hasUpperCase) {
                return "Witaj, " + name;
            } else {
                return "WITAJ, " + name;
            }
        } else {
            return "Witaj, mój przyjacielu";
        }
    }

}
