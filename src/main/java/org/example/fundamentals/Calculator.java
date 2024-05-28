package org.example.fundamentals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

//        Using the switch statement, write a calculator that implements the following options:
//
//adding
//subtraction
//sharing
//multiplication

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add first number: ");
        double firstNumber=scanner.nextDouble();

        System.out.println("Add method, you can chose +,-,*,/ :");
        char operator= scanner.next().charAt(0);

        System.out.println("Add second number: ");
        double secondNumber=scanner.nextDouble();

        double result=0.0;

        switch (operator){
            case '+':
                result=firstNumber+secondNumber;
                break;
            case '-':
                result=firstNumber-secondNumber;
                break;
            case '*':
                result=firstNumber*secondNumber;
                break;
            case '/':
                result=firstNumber/secondNumber;
                break;
        }
        System.out.print("="+result);
        scanner.close();
    }
}
