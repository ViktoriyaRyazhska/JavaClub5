package javaclub5.conditions.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a function that checks if a number n is divisible by two numbers x AND y.
 * All inputs are positive, non-zero digits.
 *
 * @author Dmytro Prudius
 */

public class DivisibleNb {

    public static void start(BufferedReader br) {
        System.out.println("Enter a number that is divisible by two numbers: ");
        try {
            System.out.println("Number to be divided");
            long number = Integer.parseInt(br.readLine());
            System.out.println("First number to be divided ");
            long number2 = Integer.parseInt(br.readLine());
            System.out.println("Second number to be divided ");
            long number3 = Integer.parseInt(br.readLine());
            System.out.println("Result: " + isDivisible(number, number2, number3));
        } catch (IOException e) {
            System.out.println("Wrong input.");
        }
    }

    public static boolean isDivisible(long n, long x, long y) {
        if (n % x == 0 && n % y == 0) {
            return true;
        } else {
            return false;
        }

    }

}
