package javaclub5.OOP.task51;

import java.util.Scanner;

public class Task51 {
    public static void start (Scanner scanner){
        try {
            System.out.println("Enter number to convert it into the string: ");
            int numberToConvert;
            System.out.println(numberToConvert = scanner.nextInt());
            convertedNum(numberToConvert);
        } catch (Exception e){

        }
    }

    public static String convertedNum (int i){
        String str = String.valueOf(i);
        System.out.println(str + " is string now!");
        return str;
    }
}
