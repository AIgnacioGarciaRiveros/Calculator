package com.company.entities;

import com.company.Exception.OperationException;
import com.company.Interfaces.IOperation;
import com.company.Validation.DivisionValidation;

public class Division extends DivisionValidation implements IOperation  {
    private double firstNumber;
    private double secondNumber;

    public Division() {
    }

    public Division(double firstNumber, double secondNumber) {
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
    public double mathOperation(double firstNumber, double secondNumber) throws OperationException {
        isZero(secondNumber);
        return firstNumber/secondNumber;
    }
}

