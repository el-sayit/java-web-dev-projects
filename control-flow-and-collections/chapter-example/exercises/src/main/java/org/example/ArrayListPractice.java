package org.example;

import java.util.ArrayList;

public class ArrayListPractice {
    public static int getSum(ArrayList<Integer> arr){
    int result =0;
        for (int number : arr) {
            if (number % 2 == 0)
                result = result+number;

        }
        return result;
    }
}
