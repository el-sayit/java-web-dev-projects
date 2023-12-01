package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
//        final double PI =3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius of a circle");
//        if(input.hasNextLine()){
//            System.out.println("Please enter valid input");
//
//        }
//        else {
            double radius = input.nextDouble();
            double areaOfCircle = Circle.getArea(radius);
            System.out.println("Area of circle is: " + areaOfCircle);

//        }


    }
}
