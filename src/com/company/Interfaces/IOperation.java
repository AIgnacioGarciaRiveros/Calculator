package com.company.Interfaces;

import com.company.Exception.OperationException;

public interface IOperation {
    double mathOperation(double firstNumber,double secondNumber) throws OperationException;
}
