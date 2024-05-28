package org.example.fundamentals;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {

//        Write a program that calculates the BMI (body mass index) value according to formula:
//        weight/height^2 . If the result is in the range (18.5 - 24.9)
//        it prints "normal weight", if below it is "underweight", if above it is "overweight".

        Scanner scanner= new Scanner(System.in);

        System.out.println("Add your weight in kg: ");
        double weight= scanner.nextDouble();

        System.out.println("Add your height in m: ");
        double height= scanner.nextDouble();

        double bmi= weight/(height*height) ;

        if (bmi>18.5&& bmi<24.9) {
            System.out.println("Normal weight");
        }else if (bmi<18.5){
            System.out.println("Underweight");
        }else {
            System.out.println("Overweight");
        }
        scanner.close();
    }
}
