package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer,String> students = new HashMap<>();
    Scanner input = new Scanner(System.in);
        System.out.println("Enter student details .. or hit ENTER two times to finish");
    String newStudent;
//    int id = input.nextInt();
    //getting student id and names
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());

    }
}
