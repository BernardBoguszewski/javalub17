package com.example.demo;

public class Greetings {

    public String greet(String name) {

        if ( name.contains(",")) {
            return name.replace(",", " i ") + ", witajcie!";
        }

        if (name == name.toUpperCase()) {
            return "WITAJ " + name;
        }

        if (name == null) {
            return "Witaj, mój przyjacielu";

        } else {
            return "Witaj, " + name;
        }
    }
}
