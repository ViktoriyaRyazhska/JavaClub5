package javaclub5.conditions.task29;

import java.util.Scanner;

public class Task29 {
    /*
    When provided with a number between 0-9, return it in words.
     */
    public static String task29(int m) {
            switch (m) {
                case 0:
                    System.out.println("Zero");
                    return "Zero";
                case 1:
                    System.out.println("One");
                    return "One";
                case 2:
                    System.out.println("Two");
                    return "Two";
                case 3:
                    System.out.println("Three");
                    return "Three";
                case 4:
                    System.out.println("Four");
                    return "Four";
                case 5:
                    System.out.println("Five");
                    return "Five";
                case 6:
                    System.out.println("Six");
                    return "Six";
                case 7:
                    System.out.println("Seven");
                    return "Seven";
                case 8:
                    System.out.println("Eight");
                    return "Eight";
                case 9:
                    System.out.println("Nine");
                    return "Nine";
            }
        return "";
    }
    public static void main(Scanner scanner) {
        System.out.println("Enter the number (0-9): ");
        try{
            int m = scanner.nextInt();
            System.out.println(task29(m));
        }catch (Exception e) {

            System.out.println("Put correct number");

        }
    }
}
