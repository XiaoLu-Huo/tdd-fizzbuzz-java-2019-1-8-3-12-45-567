package com.thoughtworks.tdd;

public class FizzBuzzWhizz {
    public String fizzBuzz(Integer input) {
        return getResult(input).equals("") ? input.toString() : getResult(input);
    }

    private String getResult(Integer input) {
        CreateRule createRule = new CreateRule();
        String fizz = createRule.fizzResult(input);
        String buzz = createRule.buzzResult(input);
        String whizz = createRule.whizzResult(input);
        return fizz + buzz + whizz;
    }
}
