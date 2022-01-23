package com.company.entities;

import com.company.Interfaces.IOperation;

public class Subtraction  implements IOperation {
    private double firstNumber;
    private double secondNumber;

    public Subtraction() {
    }

    public Subtraction(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public double mathOperation(double firstNumber, double secondNumber) {
        return firstNumber-secondNumber;
    }
}
