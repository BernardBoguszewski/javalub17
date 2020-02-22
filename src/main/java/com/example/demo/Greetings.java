package com.example.demo;

public class Greetings {

    public String greet(String name) {
        String greeting;

        if (name != null) {
            if (name.toUpperCase().equals(name)) {
                greeting = "WITAJ " + name + "!";
            } else {
                if (name.contains(",")) {
                    String[] names = name.split(",");
                    greeting = names[0] + " i " + names[1] + ", witajcie!";
                } else {
                    greeting = "Witaj, " + name;
                }
            }
        } else {
            greeting = "Witaj, mój przyjacielu";
        }

        return greeting;
    }

}
