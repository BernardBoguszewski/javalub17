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
                    if (names.length == 2) {
                        greeting = names[0] + " i " + names[1] + ", witajcie!";
                    } else {
                        if (names[2].toUpperCase().equals(names[2])) {
                            greeting = names[0] + " i " + names[1] + ", witajcie!" + " WITAJ " + names[2] + "!";
                        } else {
                            greeting = names[0] + ", " + names[1] + " i " + names[2] + ", witajcie!";
                        }
                    }
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
