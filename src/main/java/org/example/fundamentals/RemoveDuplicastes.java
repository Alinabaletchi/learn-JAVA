package org.example.fundamentals;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicastes {
    public static void main(String[] args) {
//        Write a program to remove duplicates from an array and return a new array
        Integer[] array={2,5,7,9,2,7,5,0,4};

        Set<Integer> set= new LinkedHashSet<>(Arrays.asList(array));

        Integer[] arrayWithOutDuplicates=set.toArray(new Integer[0]);

        System.out.println("Array without duplicates: "+ Arrays.toString(arrayWithOutDuplicates));


    }
}
