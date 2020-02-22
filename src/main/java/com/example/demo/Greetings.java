package com.example.demo;

public class Greetings {

    public String greet(String name) {


        if (name != null && !name.isEmpty()) {

            boolean hasUpperCase = name.equals(name.toUpperCase());

            if (name.contains(",")) {
                int coma = name.indexOf(",");
                String name1 = name.substring(0, coma);
                String name2 = name.substring(coma + 1);
                String names = name1.concat(" i " + name2);
                return names.concat(", witajcie!");
            }

            if (!hasUpperCase) {
                return "Witaj, " + name;
            } else {
                return "WITAJ, " + name;
            }
        } else {
            return "Witaj, mój przyjacielu";
        }
    }

}
