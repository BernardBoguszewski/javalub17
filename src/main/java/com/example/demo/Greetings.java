package com.example.demo;

public class Greetings {

    public String greet(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isUpperCase(name.charAt(i))) break;
            if (i == name.length() - 1) {
                return "WITAJ, " + name;
            }
        }
        if (name == null) name = "mój przyjacielu";
        return "Witaj, " + name;
    }
}
