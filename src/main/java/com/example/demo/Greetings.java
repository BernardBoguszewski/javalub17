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
            if (namesList.length == 2) {
                return namesList[0] + " i" + namesList[1] + ", witajcie!";
            } else if (namesList.length == 3) {
                return namesList[0] + "," + namesList[1] + " i" + namesList[2] + ", witajcie!";
            }
        }

        return "Witaj, " + name;
    }
}



