package javaclub5.basicprogram.Task8;

import java.util.Scanner;

public class Task8 {

    public static void start(Scanner scanner) {
        System.out.println("Enter a year: ");
        try {
            int year = Integer.parseInt(scanner.nextLine());
            System.out.println("Century of a year " + year + " is " + defineCentury(year));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public static int defineCentury(int a) {
        if (a <= 100) {
            a = 1;
        } else if (a > 100) {
            if (a % 100 == 0) {
                a = a / 100;
            } else if (a % 100 != 0) {
                a = a / 100 + 1;
            }
        }
        return a;
    }
}


