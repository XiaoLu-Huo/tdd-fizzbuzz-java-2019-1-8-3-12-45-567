package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzz(Integer input) {
        return getResult(input).equals("") ? input.toString() : getResult(input);
    }

    private String getResult(Integer input) {
        String fizz = fizzResult(input);
        String buzz = buzzResult(input);
        String whizz = whizzResult(input);
        return fizz + buzz + whizz;
    }

    private String whizzResult(int input) {
        if (isDiv(input, 7)) {
            return "Whizz";
        }
        return "";
    }

    private String buzzResult(int input) {
        if (isDiv(input, 5)) {
            return "Buzz";
        }
        return "";
    }

    private String fizzResult(int input) {
        if (isDiv(input, 3)) {
            return "Fizz";
        }
        return "";
    }

    private boolean isDiv(int input, int div) {
        return input % div == 0;
    }
}
