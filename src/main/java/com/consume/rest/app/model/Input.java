package com.consume.rest.app.model;

public class Input {
    private int firstNumber;
    private int secondNumber;

    public Input() {
    }

    public Input(final int firstNumber, final int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(final int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(final int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }

    @Override
    public String toString() {
        return "Input{" +
                "firstNumber=" + this.firstNumber +
                ", secondNumber=" + this.secondNumber +
                '}';
    }
}