package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int totalMiles = input.nextInt();
        System.out.println("How many gallons of gas have you burnt?");
        int gasBurnt = input.nextInt();
        int result = totalMiles / gasBurnt;
        System.out.println("Your miles-per-gallon is " + result);
        input.close();
    }
}
