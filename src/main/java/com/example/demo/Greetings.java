package com.example.demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greetings {

    public String greet(String name) {
        if (name != null)
            return "Witaj, " + name;
        else
            return "Witaj mój przyjacielu";

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
            return null;
        }
    }

    public String greetThree(String name) {
        name = "Adam,Iza i Robert";
        if (name.contains(",")) {
            String[] stringTab = name.split(",");
            return stringTab[0] + "," + stringTab[1] + ", witajcie!";
        } else {
            return null;
        }
    }

    public String greetUpperOneName(String name) {

        String[] stringTab = name.split(",");

        if (stringTab[2].toUpperCase().equals(stringTab[2])) {

            return stringTab[0] + " i " + stringTab[1] + ", witajcie!" + " WITAJ " + stringTab[2] + "!";

        } else {

            return stringTab[0] + ", " + stringTab[1] + " i " + stringTab[2] + ", witajcie!";

        }
    }

    public String greetNumber(String name) {
        if (containsNumber(name)) {

            return "Z liczbami się nie witam.";
        } else {
            return null;
        }
    }


    private static boolean containsNumber(String name) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(name);

        return m.find();

    }
}















