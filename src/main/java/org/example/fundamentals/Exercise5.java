package org.example.fundamentals;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
//        Write a program that reads a string of characters from the user and then displays information
//        about how many times its last character is repeated in that string. For example, for the string
//        "Abracadabra", the program should display 4, because the last character is the letter "a",
//        which appears in the given string 4 times in total.
        Scanner input= new Scanner(System.in);
        System.out.println("Add your word: ");
        String word= input.next();

        if (word.isEmpty()){
            System.out.println("World not found!");
        }

        input.close();



        
    }
}
