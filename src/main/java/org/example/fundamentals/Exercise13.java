package org.example.fundamentals;

public class Exercise13 {
    public static void main(String[] args) {
//    Write a program that calculates the difference between the largest and smallest values in an array.
//Input array: [20, 20, 30, 40, 50, 50, 50],
//Result: 50 - 20 = 30

        int[] array={1,2,2,4,3,2,6,100};

        int maxNumber=array[0];
        int minNumber=array[0];

        for (int i =0; i<array.length; i++){
            if (array[i]<minNumber){
                minNumber=array[i];

            }
            if (array[i]>maxNumber){
                maxNumber=array[i];
            }
        }
        int diferentsBetweenNumber= maxNumber-minNumber;

        System.out.println("Max number is: " +maxNumber);
        System.out.println("Min number is: "+minNumber);

        System.out.println("The diferents between min number and max number is: " +diferentsBetweenNumber
        );


    }
}
