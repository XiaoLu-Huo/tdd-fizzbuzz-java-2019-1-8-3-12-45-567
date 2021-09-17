package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzz(Integer input) {
        if (input % 5 == 0) {
            return "Buzz";
        }
        if (input % 3 == 0) {
            return "Fizz";
        }
        return input.toString();
    }
}
