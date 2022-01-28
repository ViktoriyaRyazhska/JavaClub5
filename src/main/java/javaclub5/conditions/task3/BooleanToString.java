package javaclub5.conditions.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Implement a function which convert the given boolean value into its string representation.
 *
 * @author Dmytro Prudius
 */

public class BooleanToString {

    public static void start(BufferedReader br) {
        System.out.println("Converting boolean type to String.");
        System.out.println("Enter a logical value: ");
        try {
            boolean b = Boolean.parseBoolean(br.readLine());
            System.out.println("Result: " + convert(b));
        } catch (IOException e) {
            System.out.println("Wrong input.");
        }
    }

    public static String convert(boolean b) {
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }
}
