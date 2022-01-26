package javaclub5.loops.task33;

import java.util.Scanner;

public class Task33 {

    public static void start(Scanner scanner) {
        System.out.println("Enter a year: ");
        try {
            int year = Integer.parseInt(scanner.nextLine());
            int[] ints = humanYearsCatYearsDogYears(year);
            System.out.println("Human years: " + ints[0] + "\n"
                    + "Cat years: " + ints[1] + "\n"
                    + "Dog years: " + ints[2] + "\n");

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] ints = {humanYears, 0, 0};
        for (int i = 1; i < ints.length; i++) {
            for (int j = 0; j < humanYears; j++) {
                if (j == 0) {
                    ints[i] += 15;
                } else if (j == 1) {
                    ints[i] += 9;
                } else {
                    ints[i] += i+3;
                }
            }
        }
        return ints;
    }
}
