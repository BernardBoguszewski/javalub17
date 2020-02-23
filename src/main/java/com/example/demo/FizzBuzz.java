package com.example.demo;

public class FizzBuzz {
    public String FizzBuzz(Integer number) {
        double sqrt = Math.sqrt(number);
        double divaider = 1;
        boolean PrimaryNumber = false;
        if (number == null) {
            return "Nie dla null!";

        } else {
            while (divaider < sqrt) {
                if (number % divaider != 0) {
                    PrimaryNumber = true;
                }
                divaider++;
            }
            if (PrimaryNumber) {
                return "Whizz";
            } else if (number == 3) {
                return "FizzWhizz";
            } else if (number == 5) {
                return "BuzzWhizz";
            } else if (number % 3 == 0 && number % 5 == 0)
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
