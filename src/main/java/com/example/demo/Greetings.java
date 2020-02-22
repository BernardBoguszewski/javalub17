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
        return "WITAJ " + nameUpper + "!";
    }

    public String greetTwo(String name) {
        name = "Adam,Iza";
        if (name.contains(",")) {
            String[] stringTab = name.split(",");
            return stringTab[0] + " i " + stringTab[1] + ", witajcie!";
        } else {
            return "Witaj, mój przyjacielu";
        }
    }
}
