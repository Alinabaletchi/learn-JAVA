package org.example.fundamentals;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

//    Write a program that calculates the personal income tax due.
//The program is supposed to collect the income from the user and, after calculation, write the tax due on the screen.
//The tax is calculated according to the following rules:
//
//up to 85,528 the tax is 18% of the base minus PLN 556.02,
//from 85,528 the tax is PLN 14,839.02 + 32% of the surplus over PLN 85,528.00

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add your income: ");
        Double income=scanner.nextDouble();


        if (income<=85528){
            double tax= 0.18*income-556.02;
            System.out.println("Your tax is: "+ tax);
        }else if (income>85528){
            double tax2= 14839.02 +(0.32*income);
            System.out.println("Your tax is: " +tax2);
        }
        scanner.close();
    }
}
