package com.example.demo;

public class Greetings {

    public String greet(String name) {

        if (name != null) {
            if (!checkUppercase(name)) {
                return "WITAJ " + name + "!";
            } else {
                return "Witaj, " + name;
            }
        } else {
            return "Witaj, mój przyjacielu";
        }
    }

    private static boolean checkUppercase(String name) {
        char[] singleLetters = name.toCharArray();
        boolean flag = false;

        for (int i = 1; i < singleLetters.length; i++) {
            if ((int) singleLetters[i] > 96 && (int) singleLetters[i] < 123) {
                flag = true;
            }
        }
        return flag;
    }

}
