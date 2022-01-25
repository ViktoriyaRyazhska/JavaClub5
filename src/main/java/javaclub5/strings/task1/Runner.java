package javaclub5.strings.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * We need a function that can transform a number into a string.
 * What ways of achieving this do you know?
 * Examples:
 * 123 --> "123"
 * 999 --> "999"
 *
 * @author Popova Anna
 */

public class Runner {

    public static void start(BufferedReader br) {
        try {
            System.out.println("This task transforms integer to string.");
            System.out.println("Enter some number: ");
            int number = Integer.parseInt(br.readLine());
            System.out.println("Transformed from integer to string: " + transformIntToString(number));
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String transformIntToString(int number) {
        return Integer.toString(number);
    }
}
