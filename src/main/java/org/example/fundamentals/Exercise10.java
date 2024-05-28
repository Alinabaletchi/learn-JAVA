package org.example.fundamentals;

public class Exercise10 {

    public static void main(String[] args) {

        int[] array= {1,2,4,3,2};

        int sum=0;

        for (int i =0; i<array.length; i++){
            sum+=array[i];

        }
        System.out.println("Sum for array is: "+sum);
    }
}
