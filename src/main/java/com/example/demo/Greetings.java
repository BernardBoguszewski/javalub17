package com.example.demo;

public class Greetings {

    public String greet(String name) {
        String[] names = name.split(",");
        if (name.contains("[a-zA-Z]+") == false)
            return "Z liczbami się nie witam!";
        else {

            if (names.length == 0) {
                if (name == null) {
                    return "Witaj, mój przyjacielu";

                } else if (name.toUpperCase().equals(name)) {

                    return "WITAJ, " + name;
                } else {
                    return "Witaj, " + name;
                }
            } else if (names[2].equals(names[2].toUpperCase())) {

                return names[0] + ", " + names[1] + " witajcie! WITAJ " + names[2];

            } else
                return names[0] + ", " + names[1] + "i" + names[2] + " witajcie!";

        }
    }
}



