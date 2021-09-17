package com.thoughtworks.tdd;

public class CreateRule{

    public String whizzResult(int input) {
        if (isDiv(input, 7)) {
            return "Whizz";
        }
        return "";
    }

    public String buzzResult(int input) {
        if (isDiv(input, 5)) {
            return "Buzz";
        }
        return "";
    }

    public String fizzResult(int input) {
        if (isDiv(input, 3)) {
            return "Fizz";
        }
        return "";
    }

    private boolean isDiv(int input, int div) {
        return input % div == 0;
    }

}
