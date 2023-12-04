package org.example;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args){
        int[] numbers ={1, 1, 2, 3, 5, 8};
        for (int number : numbers){
            System.out.println(number);
    }
        for(int i = 0; i< numbers.length; i++){
            if(i % 2 !=0){
                System.out.println(i+ " is an odd number");
            }
        }
String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
       String[] arrOfStr = str.split(" ");
        System.out.println(Arrays.toString(arrOfStr));
//        for(int i =0; i< arrOfStr.length; i++)
//            System.out.println(arrOfStr[i]);
        String[] newArrStr = str.split("\\.");
        System.out.println(Arrays.toString(newArrStr));
    }
}
