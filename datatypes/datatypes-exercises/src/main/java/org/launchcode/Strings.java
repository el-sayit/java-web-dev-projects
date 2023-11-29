package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("What term are you looking for? ");
        String term = input.nextLine().toLowerCase();
        if (text.toLowerCase().contains(term)){
            System.out.print("The term " + term + " was FOUND");
            System.out.println(" at index " + text.indexOf(term));
            System.out.println("Length of term is "+ term.length());
            String newText = text.toLowerCase().replace(term, "");
            System.out.println(newText);
//            System.out.println(text.substring(text.indexOf(term), (text.indexOf(term)+term.length())));
        }
            else {
                System.out.println(term + " The term was NOT FOUND");
            }
input.close();
        }

    }

