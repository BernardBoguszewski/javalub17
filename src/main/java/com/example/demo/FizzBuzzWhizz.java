package com.example.demo;

public class FizzBuzzWhizz {

    public String fizzBuzzWhizz(Integer digit) {
        if (digit == null) {
            return "Nie dla null!";
        } else {
            if (digit == 3) {
                return "FizzBuzz";
            } else {
                if (digit == 5) {
                    return "BuzzWhizz";
                } else {
                    if (digit % 3 == 0) {
                        if (digit % 5 == 0) {
                            return "FizzBuzz";
                        } else {
                            return "Fizz";
                        }
                    } else {
                        if (digit % 5 == 0) {
                            return "Buzz";
                        } else {
                            if (isPrime(digit)) {
                                return "Whizz";
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean isPrime(Integer digit) {
        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }
}
