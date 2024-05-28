package org.example.fundamentals;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
//        Exercise 8
//
//Using StringBuilder, write a program that reads a string from the user,
// then creates a string that is the inverse of the given string, and displays it on the screen.
// For example, for the string "Cat" the result should be the string "toK".


        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the world: ");
        StringBuilder stringBuilder=new StringBuilder(scanner.next());

        stringBuilder.reverse();

        System.out.println(stringBuilder);
        scanner.close();

    }
}
