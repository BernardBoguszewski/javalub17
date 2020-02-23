package com.example.demo;

import java.util.ArrayList;

public class Greetings {

    public String greet(String name) {

        if (name == null) {
            name = "mój przyjacielu";
            return "Witaj, " + name;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isUpperCase(name.charAt(i))) break;
            if (i == name.length() - 1) {
                return "WITAJ, " + name;
            }
        }

        if (name.contains(",")) {
            String[] namesList = name.split(",");
            return namesList[0] + " i" + namesList[1] + ", witajcie!";
        }

        return "Witaj, " + name;
    }
}



