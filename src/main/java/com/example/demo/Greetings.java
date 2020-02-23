package com.example.demo;

public class Greetings {

    public String greet(String name) {
        String[] names = name.split(",");
        if (names.length == 0) {
            if (name == null) {
                return "Witaj, mój przyjacielu";
            } else if (name.toUpperCase().equals(name)) {

                return "WITAJ, " + name;
            } else
                return "Witaj, " + name;

        }else
            return names[0] + ", " + names[1] + " i " + names[2] + " witajcie!";

    }

}

