package com.thoughtworks.tdd;

import java.util.Arrays;
import java.util.List;

public class Rules {
    public List<Executable> createAll() {
        return Arrays.asList(
                CreateRule.create(3,"Fizz"),
                CreateRule.create(5,"Buzz"),
                CreateRule.create(7,"Whizz")
        );
    }
}
