package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Nawiasy {
    public boolean Nawiasy(String text) {
        String[] table = new String[text.length()];
        int left = 0, right = 0;
        for (int i = 0; i < text.length(); i++) {
            table[i] = String.valueOf(text.charAt(i));
            if (table[i].equals("[")) {
                left++;
            }
            if (table[i].equals("]")) {
                right++;
            }
        }
        if (left == right)
        {return true;}

        else
            return false;
    }
}
