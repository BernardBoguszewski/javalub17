package com.example.demo;

public class Greetings {

    public String greet(String name) {


        if (name == null) {
            return "Witaj, mój przyjacielu";
        }

        else if (name.equals(name.toUpperCase())) {
            return "WITAJ, " + name;
        }

        else if (name.contains(",")) {
            if (name.split(",").length == 2) {

                String[] tab = name.split(",");
                return tab[0] + " i " + tab[1];
            }
        }
        return "Witaj, " + name;
    }
}
