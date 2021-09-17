package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzz(Integer input) {
        String fizz = fizzResult(input);
        String buzz = buzzResult(input);
        String whizz = whizzResult(input);
        String result = fizz + buzz + whizz;
        return result.equals("") ? input.toString() : result;
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
