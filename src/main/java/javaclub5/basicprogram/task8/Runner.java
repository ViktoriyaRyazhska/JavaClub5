package javaclub5.basicprogram.task8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
 *
 * Task
 * Given a year, return the century it is in.
 * @author Dmytro Prudius
 */

public class Runner {

    public static void start(BufferedReader br) {
        System.out.println("Enter pleas year:");
        try {
            int year = Integer.parseInt(br.readLine());
            System.out.println("Result: " + century(year));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }

    public static int century(int number) {
        if (number % 100 == 0) {
            number = number / 100;
        } else {
            number = (number / 100) + 1;
        }
        return number;
    }
}
