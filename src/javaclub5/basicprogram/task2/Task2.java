package javaclub5.basicprogram.task2;

import java.util.Scanner;

public class Task2 {

    public static void start (Scanner scanner){
       try {
           System.out.println("To multiply write two numbers: ");
           System.out.println(multiply(scanner.nextInt(),scanner.nextInt()));
       } catch (Exception e){

       }


    }

    public static int multiply(int num1, int num2) {
        int mult = num1*num2;
        return mult;
    }
}
