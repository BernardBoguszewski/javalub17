package com.example.demo;

import java.util.ArrayList;

public class Greetings {

    public boolean isWordInCapitalLetters(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }

    public boolean containsWordInCapitalLetters(ArrayList<String> namesList) {
        for (String name : namesList) {
            if (isWordInCapitalLetters(name)) return true;
        }
        return false;
    }

    public String returnAndDeleteWordThatIsInCapitalLetters(ArrayList<String> namesList) {
        for (String name : namesList) {
            if (isWordInCapitalLetters(name)) {
                namesList.remove(name);
                return name;
            }
        }
        return null;
    }


    public String greet(String name) {


        if (name == null) {
            name = "mój przyjacielu";
            return "Witaj, " + name;
        }
        
        for (Character letter : name.toCharArray()) {
            if (Character.isDigit(letter)) return "Z liczbami się nie witam.";

        }

        if (isWordInCapitalLetters(name)) return "WITAJ, " + name;


        if (name.contains(",")) {
            String[] namesTable = name.split(",");
            ArrayList<String> namesList = new ArrayList<>();
            for (String singleName : namesTable) {
                namesList.add(singleName);
            }

            if (namesList.size() == 2) {
                return namesList.get(0) + " i " + namesList.get(1) + ", witajcie!";
            } else if (namesList.size() == 3) {
                if (containsWordInCapitalLetters(namesList)) {

                    String nameInCapitalLetters = returnAndDeleteWordThatIsInCapitalLetters(namesList);

                    return namesList.get(0) + " i " + namesList.get(1) + ", witajcie! WITAJ " + nameInCapitalLetters + "!";
                }
                return namesList.get(0) + ", " + namesList.get(1) + " i " + namesList.get(2) + ", witajcie!";
            }
        }

        return "Witaj, " + name;
    }
}



