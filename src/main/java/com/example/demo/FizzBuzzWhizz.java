package com.example.demo;

public class FizzBuzzWhizz {

    public String fizzBuzzWhizz(Integer digit) {
        if (digit != null) {
            if(digit % 5 == 0 & digit % 3 == 0){
                return "FizzBuzz";
            }
            else if(digit % 3 == 0){
                return "Fizz";
            }
            else if(digit % 5 == 0){
                return "Buzz";
            }
        }
        return "Nie dla null!";
    }

}
