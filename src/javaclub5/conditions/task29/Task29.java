package javaclub5.conditions.task29;

import java.util.Scanner;

public class Task29 {
    /*
    When provided with a number between 0-9, return it in words.
     */
    public static void task29() {

        System.out.println("Enter the number (0-9): ");
        Scanner sc = new Scanner(System.in);
        boolean n = true;
        try {
            int m;
            m = sc.nextInt();
            if(m>9){
                System.out.println("Wrong number");
            }
            switch (m) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
        }catch (Exception e) {

            System.out.println("Put correct number");

        }
    }
    public static void main(String[] args) {
        task29();
    }
}
