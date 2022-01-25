package javaclub5.basicprogram.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

/**
 * Jenny has written a function that returns a greeting for a user.
 * However, she's in love with Johnny, and would like to greet him slightly different.
 * She added a special case to her function, but she made a mistake.
 * @author Dmytro Savitskyi
 */

public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }

    public static void start(BufferedReader reader) {
        System.out.println("Enter user name");
        try{
            String name = reader.readLine();
            if (name.equals("Johnny")) {
                System.out.println("Hello, my love!");
            }
            else System.out.println("Hello, "+ name);
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }

    }
}
