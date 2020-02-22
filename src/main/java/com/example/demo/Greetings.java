package com.example.demo;

public class Greetings {

    public String greet(String name) {

        if (name.contains(",")){
            String[] stringTab = name.split(",");
            return stringTab[0] + " i " + stringTab[1] + ", witajcie!";
        }

        if (name == null){
            return "Witaj, mój przyjacielu";
        }

        String nameBig = name.toUpperCase();

        if (nameBig.equals(name)){
            return "WITAJ " + nameBig;
        }

        return "Witaj, " + name;
    }


}
