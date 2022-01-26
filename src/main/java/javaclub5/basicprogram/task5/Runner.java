package javaclub5.basicprogram.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

/**
 * Jenny has written a function that returns a greeting for a user.
 * However, she's in love with Johnny, and would like to greet him slightly different.
 * She added a special case to her function, but she made a mistake.
 *
 * @author Dmytro Savitskyi
 */

public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }

    public static void start(BufferedReader reader) {
        System.out.println("Enter user name");
        try {
            String name = reader.readLine();
            System.out.println("Result: " + greet(name));
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }

    }

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);

    }
}
