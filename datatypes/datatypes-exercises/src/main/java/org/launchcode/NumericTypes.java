package org.launchcode;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args){

        System.out.println("Please enter length of rectangle");
        Scanner input = new Scanner(System.in);
        int lengthOfRectangle = input.nextInt();
        System.out.println("Please enter width of rectangle");
        int widthOfRectangle = input.nextInt();
        int result = widthOfRectangle * lengthOfRectangle;
        System.out.println("the area of rectangle is "+ result);
        input.close();
    }
}
