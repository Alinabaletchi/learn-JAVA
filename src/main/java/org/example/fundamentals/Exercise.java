package org.example.fundamentals;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {


    //        Exercise 1
//
//declare a variable named value_int of type int and assign the value 20 to it
//then declare the value_string variable of the String type and assign the value "Java" to it
//declare the value_double variable of the double type and assign the value 23.63 to it;
//at the very end, display all variables

    int valueInt= 20;
    String valueString = "Java";
    double valueDouble= 23.63;

        System.out.println("valueInt is: " + valueInt);
        System.out.println("valueString is: " + valueString);
        System.out.println("valueDouble is: " + valueDouble);


//       Exercise 2
//
//Declare a variable temp_F of the float type, then, based on the value of the variable,
// calculate the value in Celsius: C = (F - 32) * 5 / 9
//Declare a variable of type float represents the temperature in degrees C, then, based on the formula,
// convert to temp in K: K = C + 273.15F


    Scanner scanner = new Scanner(System.in);

        System.out.println("Add tem in Fahrenheit: ");
    float tempF = Float.parseFloat(scanner.next());

    float conversionCelsius= (tempF-32)*5/9;
        System.out.println(tempF+ " Fahrenheit in celsius is: "+ conversionCelsius);

        System.out.println("Add temp in celsius: ");
        float tempC =Float.parseFloat(scanner.next());

        float conversionKelvin= tempC+273.15f;
        System.out.println(tempC + " Celsius in Kelvin is: " +conversionKelvin);

        scanner.close();

}
}
