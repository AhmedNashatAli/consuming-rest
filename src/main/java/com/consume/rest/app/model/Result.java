package com.consume.rest.app.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    Input  input;
    double result;

    public Result() {
    }

    public Result(final Input input, final double result) {
        this.input = input;
        this.result = result;
    }

    public Input getInput() {
        return this.input;
    }

    public void setInput(final Input input) {
        this.input = input;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(final double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "input=" + this.input.toString() +
                ", result=" + this.result +
                '}';
    }
}