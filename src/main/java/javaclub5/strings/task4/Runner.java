package javaclub5.strings.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Very simple, given an integer or a floating-point number, find its opposite.
 * Examples:
 * 1: -1
 * 14: -14
 * -34: 34
 *
 * @author Rostyslav Ros
 */


public class Runner {

    /**
     * finds the opposite number
     * @param number - int number,
     * @return opposite number
     */
    public static double opposite(double number) {
        if (number != 0) return -number;
        else return 0;
    }

    /**
     * main method of Class
     *
     */
    public static void start(BufferedReader reader) {
        System.out.println("Input a number");
        try {
            double number = Double.parseDouble(reader.readLine());
            System.out.printf("Opposite number will be: %f.3", opposite(number));
        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }
}
