package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Greetings {

    private final String greet = "Witaj, ";
    private final String greetForUnknown = "Witaj, mój przyjacielu";
    private List<String> names = new ArrayList<>();


    public String greet(String name) {
        if (name != null) {

            names = splitingNames(name);
            if (isExistAllBigChars(names)) {
                if (names.size() == 1) {
                    return greetToUpperCase(names.get(0));
                }
                if (names.size() == 3) {
                    String nameInUpperCase = getNameInUpperCase(names);
                    return greetingForTwoNames(names) + " " + greetToUpperCase(nameInUpperCase);
                }
            }
            return choosingGreetingLenght(names);

        } else {
            return greetForUnknown;
        }
    }

    private String getNameInUpperCase(List<String> names) {
        String temporaryName = names.stream()
                .filter(p -> p.equals(p.toUpperCase()))
                .findFirst().get();
        names.remove(temporaryName);
        return temporaryName;
    }

    private String greetToUpperCase(String name) {
        return greet.toUpperCase() + name;
    }


    private String choosingGreetingLenght(List<String> names) {
        if (names.size() == 2) {
            return greetingForTwoNames(names);
        }
        if (names.size() > 2) {
            return greetingForMoreThanTwoNames(names);
        }
        return greet + names.get(0);
    }


    private List<String> splitingNames(String name) {
        String[] split = name.split(",");
        List<String> tmp = new ArrayList<>();
        for(int i=0;i<split.length;i++){
            tmp.add(split[i]);
        }
        return tmp;
    }

    private String greetingForMoreThanTwoNames(List<String> names) {
        StringBuilder greetForMoreNames = new StringBuilder();
        for (int i = 2; i < names.size(); i++) {
            greetForMoreNames.append(names.get(i)).append(",");
        }
        return greetForMoreNames.toString() + " " + greetingForTwoNames(names);
    }

    private String greetingForTwoNames(List<String> names) {
        return names.get(0) + " i " + names.get(1) + ", witajcie!";
    }

    private boolean isExistAllBigChars(List<String> names) {
        for (String name : names) {
            if (name.equals(name.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
