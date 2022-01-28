package javaclub5.strings.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to welcome a person.
 * Note that name will be an array consisting of one or more values that should be joined together with one space
 * between each, and the length of the name array in test cases will vary.
 * <p>
 * Example:
 * sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
 * This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
 *
 * @author Popova Anna
 */

public class Runner {

    public static void start(BufferedReader br) {
        String[] fullName = new String[2];
        System.out.println("In this task we will have a greeting.");
        System.out.println("Enter your name and surname(on different lines): ");
        try {
            for (int i = 0; i < fullName.length; i++) {
                fullName[i] = br.readLine();
                System.out.println(fullName[i]);
            }
            System.out.println("Enter your city: ");
            String city = br.readLine();
            System.out.println("Enter your state: ");
            String state = br.readLine();

            System.out.println(sayHello(fullName, city, state));
        } catch (IOException e) {
            System.out.println("Smth wrong.");
        }
    }

    public static String sayHello(String[] fullname, String city, String state) {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", fullname), city, state);
    }
}
