package com.example.demo;

public class Greetings {

    public String greet(String name) {
        if (name != null) {
            if(name.equals(name.toUpperCase())){
                return "WITAJ, " + name.toUpperCase() + "!";
            }
            if(name.contains(",")){
                String[] splitNames = name.split(",");
                return splitNames[0] + " i " + splitNames[1] + ", witajcie!";
            }
            return "Witaj, " + name;
        } else {
            return "Witaj, mój przyjacielu";
        }
    }
}
