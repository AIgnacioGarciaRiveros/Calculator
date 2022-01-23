package com.company;

import com.company.Exception.OperationException;
import com.company.Presentation.CalculatorMenu;
import com.company.entities.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OperationException {
        CalculatorMenu menu=new CalculatorMenu(new Addition(), new Subtraction(), new Multiplication(), new Division());
        menu.printMenu();
    }
}
