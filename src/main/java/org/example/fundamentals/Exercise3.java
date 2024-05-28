package org.example.fundamentals;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
//       Exercise 5
//
//Write a program, that displays the following formula depending on the provided value: n=4
//1
//22
//333
//4444

        Scanner scanner= new Scanner(System.in);

        System.out.println("Add number: ");
        int a=scanner.nextInt();

        for (int i=0; i<=a; i++){
            for (int j=0; j<i+1; j++){
                System.out.print(i);

            }
            System.out.println();
        }
        scanner.close();
    }
}
