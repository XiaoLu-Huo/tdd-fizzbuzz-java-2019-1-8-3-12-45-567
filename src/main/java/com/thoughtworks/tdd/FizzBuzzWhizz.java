package com.thoughtworks.tdd;

import java.util.List;

public class FizzBuzzWhizz {
    public String fizzBuzz(Integer input) {
        return getResult(input).equals("") ? input.toString() : getResult(input);
    }

    private String getResult(Integer input) {
        List<Executable> all = new Rules().createAll();
        String[] strings = all.stream().map(item -> item.exec(input)).toArray(String[]::new);
        return String.join("",strings);
    }
}
