package com.example.demo;

public class Greetings {

    private final String greet = "Witaj, ";
    private final String greetForUnknown = "Witaj, mój przyjacielu";
    private String[] names = null;


    public String greet(String name) {
        if (name != null) {
            if (isExistAllBigChars(name)) {
                String greetToUpperCase = greet.toUpperCase();
                return greetToUpperCase + name;
            }
            names = splitingNames(name);
            if (names.length == 2) {
                return greetingForTwoNames(names);
            }
            if (names.length > 2) {
                return greetingForMoreThanTwoNames(names);
            }
            return greet + names[0];
        } else {
            return greetForUnknown;
        }
    }

    private String[] splitingNames(String name) {
        return name.split(",");
    }

    private String greetingForMoreThanTwoNames(String[] names) {
        StringBuilder greetForMoreNames = new StringBuilder();
        for (int i = 2; i < names.length; i++) {
            greetForMoreNames.append(names[i]).append(",");
        }
        return greetForMoreNames.toString() + " " + greetingForTwoNames(names);
    }

    private String greetingForTwoNames(String[] names) {
        return names[0] + " i " + names[1] + ", witajcie!";git status
    }

    private boolean isExistAllBigChars(String name) {
        return name.equals(name.toUpperCase());
    }
}
