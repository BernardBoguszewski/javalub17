package com.example.demo;

public class Greetings {

    public String greet(String name) {
        if (name.contains(",")) {
            String[] array = name.split(",");
            return array[0] + "," + array[1] + "i" + array[2] + ", witajcie!";
        }
        if (name.contains(",")) {
            return name.replace(",", "i") + ", witajcie!";
        }
        if (name == name.toUpperCase()) {
            return "WITAJ " + name;
        }
        if (name == null) {
            return "Witaj, mój przyjacielu";
        } else {
            return "Witaj, " + name; }
        }
    }
