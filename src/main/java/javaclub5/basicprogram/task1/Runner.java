package javaclub5.basicprogram.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Code as fast as you can!
 * You need to double the integer and return it.
 *
 * @author Popova Anna
 */

public class Runner {

    public static void start(BufferedReader br) {
        System.out.println("Enter number, after it will be multiplied by 2: ");
        try {
            int number = Integer.parseInt(br.readLine());
            System.out.println("Result: " + doubleInt(number));
        } catch (Exception e) {
            System.out.println("Invalid number provided.");
            System.err.println(e.getMessage());
        }
    }

    public static int doubleInt(int i) {
        return i * 2;
    }

}
