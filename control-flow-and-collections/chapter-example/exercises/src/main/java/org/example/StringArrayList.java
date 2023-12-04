package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
    public static ArrayList<String> getFiveLetterWords(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number...");
        int num = input.nextInt();
        ArrayList<String> fiveLetterWords =new ArrayList<>();
        for(String word : arr){
        if(word.length() ==num)
            fiveLetterWords.add(word);
    }
        return fiveLetterWords;
    }
}
