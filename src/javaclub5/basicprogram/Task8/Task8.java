package javaclub5.basicprogram.Task8;

import java.util.Scanner;

public class Task8 {

    public static void start(Scanner scanner) {
        System.out.println("Enter a year: ");
        try {
            int year = Integer.parseInt(scanner.nextLine());
            defineCentury(year);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public static void defineCentury(int a) {
        if (a <= 100) {
            System.out.println("Century of a year " + a + " is " + 1);
        } else if (a > 100) {
            if (a % 100 == 0) {
                System.out.println("Century of a year " + a + " is " + a / 100);
            } else if (a % 100 != 0) {
                System.out.println("Century of a year " + a + " is " + (a / 100 + 1));
            }
        }
    }
}


