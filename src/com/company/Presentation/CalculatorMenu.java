package com.company.Presentation;

import com.company.Exception.OperationException;
import com.company.entities.*;

import java.util.Scanner;

public class CalculatorMenu {
    private final Scanner scan = new Scanner(System.in);
    private final Addition addition;
    private  final Subtraction subtraction;
    private  final Multiplication multiplication;
    private final Division division;
//probar pasando la interfaz
    public CalculatorMenu(Addition addition, Subtraction subtraction, Multiplication multiplication, Division division) {
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }
    public void printStart(){
        System.out.println("INGRESE LA OPERACIÓN A REALIZAR: '/n'"+"1)SUMAR"+
                "/n"+"2)RESTAR"+"/n"+"3)MULTIPLICAR"+"/n"+"4)DIVIDIR"+"/n"+"5)SALIR"+"/n");
    }
    public int enterOption(){
        System.out.println("Ingrese la opción");
        return scan.nextInt();
    }
    public void printMenu() throws OperationException {
        printStart();
        while(enterOption()!=6){
          Double firstNumber=enterNumber();
          Double secondNumber=enterNumber();
          Double result;
            switch(enterOption()) {
                case 1:
                    addition.setFirstNumber(firstNumber);
                    addition.setSecondNumber(secondNumber);
                    result = addition.mathOperation(firstNumber,secondNumber);
                    printResult(result);
                    break;
                case 2:
                    subtraction.setFirstNumber(firstNumber);
                    subtraction.setSecondNumber(secondNumber);
                    result = subtraction.mathOperation(firstNumber,secondNumber);
                    printResult(result);
                    break;
                case 3:
                    multiplication.setFirstNumber(firstNumber);
                    multiplication.setSecondNumber(secondNumber);
                    result = multiplication.mathOperation(firstNumber,secondNumber);
                    printResult(result);
                    break;
                case 4:
                    division.setFirstNumber(firstNumber);
                    division.setSecondNumber(secondNumber);
                    result = division.mathOperation(firstNumber,secondNumber);
                    printResult(result);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Ha salido con exito de la calculadora");
                    break;
                default:
                    InvalidOption();
            }
            printStart();
        }
    }
    public Double enterNumber(){
        System.out.println("Ingrese un numero");
        return scan.nextDouble();
    }
    public void InvalidOption(){
        System.out.println("Opcion Invalida.Recuerde que las opciones disponibles son del 1-5");
    }
    public void printResult(Double number){
        System.out.println("Resultado "+ number);
    }
}
