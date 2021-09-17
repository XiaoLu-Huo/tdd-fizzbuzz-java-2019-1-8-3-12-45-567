package com.thoughtworks.tdd;

public class CreateRule implements Executable{
    private int input;
    private String output;

    public CreateRule(int input, String output) {
        this.input = input;
        this.output = output;
    }

    public static Executable create(int in, String out){
        return new CreateRule(in,out);
    }

    @Override
    public String exec(int num) {
        return num % input == 0 ? output : "";
    }
}
