package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greetings {

    public String greet(String name){
        if (name != null) {
            if(containsNumber(name)){
                return "Z liczbami się nie witam.";
            }
            if(name.equals(name.toUpperCase())){
                return "WITAJ, " + name.toUpperCase() + "!";
            }
            if(name.contains(",")){
                String[] splitNames = name.split(",");
                String result1 = splitNames[0] + " i " + splitNames[1] + ", witajcie!";
                String result2 = splitNames[0] + ", " + splitNames[1] + " i " + splitNames[2] + ", witajcie!";
                String result3 = splitNames[0] + " i " + splitNames[1] + ", witajcie!" + " WITAJ " + splitNames[2].toUpperCase() + "!";
                if(splitNames.length == 3){
                    if(splitNames[2].toUpperCase().equals(splitNames[2])){
                        return result3;
                    }
                    return result2;
                }
                return result1;
            }
            return "Witaj, " + name;
        } else {
            return "Witaj, mój przyjacielu";
        }
    }

    public static boolean containsNumber(String name){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(name);

        return matcher.find();
    }
}
