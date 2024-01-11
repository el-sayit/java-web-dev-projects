package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
    Divide(25,0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!.
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));

    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        try {
            if (y == 0){
                throw new ArithmeticException("The value of y can not be 0");
        }
        int result = x/y;
        System.out.println(result);
            } catch (ArithmeticException e){
                e.printStackTrace();
            }
    }


    public static int CheckFileExtension(String fileName){
        try {
            if(fileName.isEmpty()|| fileName==null){
                throw new IllegalArgumentException("The value of filename can not be empty or null!");
        }
            }
            catch (IllegalArgumentException e){
            e.printStackTrace();

        }
        if (fileName.endsWith(".java")){
            return 1;
        }
            else return 0;

    }

        // Write code here!


}