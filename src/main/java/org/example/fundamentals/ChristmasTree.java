package org.example.fundamentals;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
//        Write a program that draws a "Christmas tree" in the console consisting of asterisks (*).
//The user of the program should enter an integer n, n > 0, specifying the height of the Christmas tree (number of lines).
//Example: for n = 5 the result should look like this:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palace add christmas tree tall: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();


        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");


        }
    }
}
