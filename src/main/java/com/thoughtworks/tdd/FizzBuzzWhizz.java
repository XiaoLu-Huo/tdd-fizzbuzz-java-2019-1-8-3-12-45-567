package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzz(Integer input) {
        if (input % 7 == 0 && input % 5 == 0 && input % 3 == 0) {
            return "FizzBuzzWhizz";
        }
        if (input % 7 == 0 && input % 5 == 0) {
            return "BuzzWhizz";
        }
        if (input % 7 == 0 && input % 3 == 0) {
            return "FizzWhizz";
        }
        if (input % 5 == 0 && input % 3 == 0) {
            return "FizzBuzz";
        }
        if (input % 7 == 0) {
            return "Whizz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        if (input % 3 == 0) {
            return "Fizz";
        }
        return input.toString();
    }
}
