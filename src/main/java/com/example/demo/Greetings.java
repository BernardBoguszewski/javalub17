package com.example.demo;

public class Greetings {

    public String greet(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return "Z liczbami się nie witam!";
            }
        }

        if (name.contains(",")) {
            String[] array = name.split(",");
            if (array[2].equals(array[2].toUpperCase())) {
                return array[0] + " i " + array[1] + ", witajcie!" + " WITAJ " + array[2] + "!";
            }
            if (array[1].equals(array[1].toUpperCase())) {
                return array[0] + " i " + array[2] + ", witajcie!" + " WITAJ " + array[1] + "!";
            }
            if (array[0].equals(array[0].toUpperCase())) {
                return array[1] + " i " + array[2] + ", witajcie!" + " WITAJ " + array[0] + "!";
            }
            return array[0] + ", " + array[1] + " i " + array[2] + ", witajcie!";
        }

        if (name.contains(",")) {
            String[] array = name.split(",");
            return array[0] + ", " + array[1] + " i " + array[2] + ", witajcie!";
        }
        if (name.contains(",")) {
            return name.replace(",", " i ") + ", witajcie!";
        }

        if (name == name.toUpperCase()) {
            return "WITAJ " + name;
        }

        if (name == null) {
            return "Witaj, mój przyjacielu";

        } else {
            return "Witaj, " + name;
        }
    }
}

