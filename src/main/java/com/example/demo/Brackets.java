package com.example.demo;

public class Brackets {

    public boolean isPaired(String brackets) {
        int i = 0;
        for (Character bracket : brackets.toCharArray()) {
            if (bracket == '[') i++;
            if (bracket == ']') i--;
            if (i < 0) return false;
        }
        if (i == 0) {
            return true;
        } else {
            return false;
        }
    }
}

