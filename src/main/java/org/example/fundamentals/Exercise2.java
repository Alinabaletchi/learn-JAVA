package org.example.fundamentals;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
//        Exercise 3
//
//Read in 3 integers from the user and print the largest and smallest of them on the screen.
// If the user has entered 3 of the same numbers, the applicable message should be displayed

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add first number: ");
        int a = scanner.nextInt();

        System.out.println("Add second number: ");
        int b = scanner.nextInt();

        System.out.println("Add last number: ");
        int c = scanner.nextInt();


        if (a == b && b == c) {
            System.out.println("Numbers are equals!");
        } else {
            int maxNumber = Math.max(Math.max(a, b), c);
            int minNumber = Math.min(Math.min(a, b), c);

            System.out.println("Max number is " + maxNumber);
            System.out.println("Min number is: " +minNumber);
        }


//      4.  based on the integer variable:evaluation, will display one of the following information:
//        no promotion to the next class,
//        promotion to the next class,
//        promotion with an excellent grade

        System.out.println("Add your score: ");
        int score= scanner.nextInt();
        if (score>10){
            System.out.println("Your score is wrong!");
        }

        switch (score){
            case 1:
                System.out.println("No promotion to the next class");
                break;
            case 2:
                System.out.println("No promotion to the next class");
                break;
            case 3:
                System.out.println("No promotion to the next class");
                break;
            case 4:
                System.out.println("No promotion to the next class");
                break;
            case 5:
                System.out.println("Promotion to the next class");
                break;
            case 6:
                System.out.println("Promotion to the next class");
                break;
            case 7:
                System.out.println("Promotion to the next class");
                break;
            case 8:
                System.out.println("Promotion to the next class");
            case 9:
                System.out.println("Promotion with an excellent grade");
                break;
            case 10:
                System.out.println("Promotion with an excellent grade");
                break;
        }
        scanner.close();
    }
}
