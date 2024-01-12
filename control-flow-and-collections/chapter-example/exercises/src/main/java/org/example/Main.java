package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // using do-while to add random numbers into Arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        int max = 0;
        do {
            int randomNumber = (int)Math.round(Math.random() *100);
            numbers.add(randomNumber);
            max++;
        } while(max<=10);
        System.out.println(numbers);
        System.out.println(ArrayListPractice.getSum(numbers));
        //getting user input and printing words with length
ArrayList<String> words = new ArrayList<>();
words.add("five");
words.add("main");
words.add("enter");
words.add("mouse");
words.add("iphone");
words.add("orange");
words.add("laptop");
        System.out.println(StringArrayList.getFiveLetterWords(words));
    }
}