package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzWhizzTest {

    @Test
    void should_return_string_when_input_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer input = 1;
        String result = fizzBuzzWhizz.fizzBuzz(input);
        assertThat(result,is("1"));
    }

    @Test
    void should_return_fizz_when_input_Multiples_of_3() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertThat(fizzBuzzWhizz.fizzBuzz(3),is("Fizz"));
    }
}
