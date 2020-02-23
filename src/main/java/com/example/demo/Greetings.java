package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greetings {

    public String greet(String name) {

        if (name != null) {
            if (containsNumber(name)) {
                return "Z liczbami się nie witam.";
            } else {
                if (name.toUpperCase().equals(name)) {
                    return "WITAJ " + name + "!";
                } else {
                    if (name.contains(",")) {
                        String[] names = name.split(",");
                        if (names.length == 2) {
                            return names[0] + " i " + names[1] + ", witajcie!";
                        } else {
                            if (names[2].toUpperCase().equals(names[2])) {
                                return names[0] + " i " + names[1] + ", witajcie!" + " WITAJ " + names[2] + "!";
                            } else {
                                return names[0] + ", " + names[1] + " i " + names[2] + ", witajcie!";
                            }
                        }
                    } else {
                        return "Witaj, " + name;
                    }
                }
            }
        } else {
            return "Witaj, mój przyjacielu";
        }
    }


    private static boolean containsNumber(String name) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(name);

        return m.find();
    }

}
