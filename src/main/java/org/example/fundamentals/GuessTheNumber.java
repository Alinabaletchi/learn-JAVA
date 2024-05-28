package org.example.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
//        Exercise 4
//
//The task is to write a Java program in which the user will be given K attempts to guess a randomly generated number. Below are the rules of the game:
//
//If the guessed number is greater than the real number, the program will reply with a message that the guessed number is higher than the real one.
//If the guessed number is less than the real number, the program will reply with a message that the guessed number is lower than the real one.
//If the guessed number is equal to the real number, or if K attempts are exhausted, the program will exit with the appropriate message.

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int maxAttempts=3;
        int randomNumber= random.nextInt(100)+1;
        boolean correctAnswer= false;

        for (int i=1; i<=maxAttempts; i++){
            System.out.println("TRYING " +i+ "->"+"  Add number: ");
            int guess= scanner.nextInt();

            if (guess==randomNumber){
                correctAnswer=true;
                break;
            }else if (guess<randomNumber){
                System.out.println("Your number is low! ");
            }else {
                System.out.println("Your number is to big! ");
            }
        }
        if (correctAnswer){
            System.out.println("CONGREGATION YOU GUESS THE NUMBER: "+randomNumber);
        }else {
            System.out.println("YOU DONT HAVE ANOTHER CHANCE! THE NUMBER IS: " +randomNumber);
        }
        scanner.close();


    }
}
