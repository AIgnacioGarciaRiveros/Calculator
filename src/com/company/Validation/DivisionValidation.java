package com.company.Validation;

import com.company.Exception.OperationException;

public class DivisionValidation {
    public void isZero(Double number) throws OperationException {
        if(number==0)throw new OperationException("No se puede dividir por cero ");
    }
}
