package javaclub5.conditions.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Very simple, given an integer or a floating-point number, find its opposite.
 * @author Dmytro Prudius
 */
public class Runner{

    public static void start(BufferedReader br) {
        System.out.println("This task makes the number opposite( 2 -> -2).");
        System.out.println("Enter please number: ");
        try {
            int number = Integer.parseInt(br.readLine());
            System.out.println("Result: " + opposite(number));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }

    public static int opposite(int number) {
        return -number;
    }
}

