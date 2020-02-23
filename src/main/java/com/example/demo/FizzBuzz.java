package com.example.demo;

public class FizzBuzz {
    public String FizzBuzz(Integer number) {
        if (number == null) {
            return "Nie dla null!";
        } else {
            if (number % 3 == 0 && number % 5 == 0)
                return "FizzBuzz";
            else {
                if (number % 3 == 0)
                    return "Fizz";
                if (number % 5 == 0)
                    return "Buzz";
            }

        }
        return null;
    }
}
