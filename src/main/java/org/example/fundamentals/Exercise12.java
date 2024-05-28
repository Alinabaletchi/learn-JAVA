package org.example.fundamentals;

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
//        Write a program to invert the contents of an array


        Integer[] array={5,6,89,3,2};

        System.out.println("The original array: " + Arrays.toString(array));

        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        Integer[] invertedArray=list.toArray(new Integer[0]);

        System.out.println("The inverted list: "+Arrays.toString(invertedArray));

    }
}
