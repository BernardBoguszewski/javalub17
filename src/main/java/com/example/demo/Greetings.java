package com.example.demo;

public class Greetings {

    public String greet(String name) {

        if (name==null){
            return "Witaj, mó przyjacielu";
        }
        return "Witaj, " + name;
    }
}
