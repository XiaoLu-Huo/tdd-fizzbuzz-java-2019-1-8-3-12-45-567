package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzz(Integer input) {
        if (isDiv(input,105)) {
            return "FizzBuzzWhizz";
        }
        if (isDiv(input,35)) {
            return "BuzzWhizz";
        }
        if (isDiv(input,21)) {
            return "FizzWhizz";
        }
        if (isDiv(input,15)) {
            return "FizzBuzz";
        }
        if (isDiv(input,7)) {
            return "Whizz";
        }
        if (isDiv(input,5)) {
            return "Buzz";
        }
        if (isDiv(input,3)) {
            return "Fizz";
        }
        return input.toString();
    }

    private boolean isDiv(int input,int div){
        return input % div == 0;
    }
}
