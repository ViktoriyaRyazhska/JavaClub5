package javaclub5.conditions.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
 *
 * @author Popova Anna
 */
public class Runner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("Lets, play. You need answer: true or false.");
        System.out.println("Do you like dogs?");
        try {
            String answer = br.readLine();
            boolean firstAnswer = Boolean.parseBoolean(answer);
            System.out.println(yesOrNo(firstAnswer));

            System.out.println("Do you like cats?");
            answer = br.readLine();
            boolean secondAnswer = Boolean.parseBoolean(answer);
            System.out.println(yesOrNo(secondAnswer));
        } catch (IOException e) {
            System.out.println("Entered something wrong.");
        }
    }

    public static String yesOrNo(boolean answer) {
        if (answer) {
            return "Yes";
        } else {
            return "No";
        }
    }

}
