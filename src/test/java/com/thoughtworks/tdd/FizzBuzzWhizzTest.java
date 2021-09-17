package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzWhizzTest {

    @Test
    void should_return_string_when_input_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer input = 1;
        String result = fizzBuzzWhizz.fizzBuzz(input);
        assertThat(result, is("1"));
    }

    @Test
    void should_return_fizz_when_input_Multiples_of_3() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertThat(fizzBuzzWhizz.fizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzzWhizz.fizzBuzz(6), is("Fizz"));
        assertThat(fizzBuzzWhizz.fizzBuzz(9), is("Fizz"));

    }

    @Test
    void should_return_fizz_when_input_Multiples_of_5() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertThat(fizzBuzzWhizz.fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzzWhizz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    void should_return_fizz_when_input_Multiples_of_3_5() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertThat(fizzBuzzWhizz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzzWhizz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    void should_return_fizz_when_input_Multiples_of_7() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertThat(fizzBuzzWhizz.fizzBuzz(7), is("Whizz"));
        assertThat(fizzBuzzWhizz.fizzBuzz(14), is("Whizz"));
    }
}
