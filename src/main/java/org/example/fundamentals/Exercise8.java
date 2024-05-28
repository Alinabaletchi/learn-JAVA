package org.example.fundamentals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) throws ParseException {


//    Write a program that displays the given date in the format:
//-> hour::minute day of the month-year
//-> hh:mm:ss a day of the month year

        Scanner scanner= new Scanner(System.in);
        System.out.println("Add HH:mm dd-MM-yyyy: ");
        String UserInput= scanner.nextLine();

        System.out.println("Add HH:mm:ss dd-MM-yyyy: ");
        String UserInput1=scanner.nextLine();


        scanner.close();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat1= new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");


        try {
            Date date= simpleDateFormat.parse(UserInput);
            System.out.println("Date and hour format: "+ simpleDateFormat.format(date));
        }catch (Exception e){
            System.out.println("The format it is incorrect!");
        }

        try {
            Date date1=simpleDateFormat1.parse(UserInput1);
            System.out.println("Data format: " + simpleDateFormat1.format(date1));
        }catch (Exception e){
            System.out.println("The format is not available!");
        }



    }
}
