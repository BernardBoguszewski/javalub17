package com.example.demo;


import java.util.Stack;

public class Brackets {

    public boolean checkBrackets(String bracketsSet) {
        if (bracketsSet == null) {
            return false;
        } else {
            Stack<Character> bracketsStack = new Stack<>();
            for (int i = 0; i < bracketsSet.length(); i++) {
                char currentBracket = bracketsSet.charAt(i);
                if (currentBracket == '[') {
                    bracketsStack.push(currentBracket);
                } else {
                    if (bracketsStack.isEmpty()) {
                        return false;
                    } else {
                        bracketsStack.pop();
                    }
                }
            }
            return bracketsStack.isEmpty();
        }

    }
}
