package org.example.fundamentals;

import java.util.HashSet;
import java.util.Set;

public class Exercise9 {
    public static void main(String[] args) {

//       Given a list of numbers and a number k, return whether any two numbers in the list add up to k.
//For example, given [10, 15, 3, 7] and k of 17, returns true because 10 + 7 is 17.


        int[] array={10,15,3,7};
        int a=17;

         boolean sumNumberOfTheArray=sumNumberOfTheArray(array,a);
        System.out.println(sumNumberOfTheArray);

    }

    public static boolean sumNumberOfTheArray(int[] array, int a){
        Set<Integer> setWithoutDuplicate= new HashSet<>();
        for (int num:array){
            int complement =a-num;
            if (setWithoutDuplicate.contains(complement)) {
                return true;
            }
            setWithoutDuplicate.add(num);
        }
        return false;
    }
}
