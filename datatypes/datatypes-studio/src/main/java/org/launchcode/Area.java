package org.launchcode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Area {
    public static void main(String[] args){
//        final double PI =3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius of a circle");
        double radius;
//        double radius = input.nextDouble();


        if(input.hasNextDouble()){
            radius = input.nextDouble();

            if (radius< 0){
                System.out.println("Please enter positive number");
            }
            else
            {
                double areaOfCircle = Circle.getArea(radius);
                System.out.println("Area of circle is: " + areaOfCircle);
            }

        }
                else System.out.println("Please enter numeric value");

    }
}
