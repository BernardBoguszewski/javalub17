package com.example.demo;

public class FizzBuzzWhizz {

    public String fizzBuzzWhizz(Integer digit) {
        if (digit != null) {
            if(digit % 3 == 0){
                return "Fizz";
            }
        }
        return "Nie dla null!";
    }

}
