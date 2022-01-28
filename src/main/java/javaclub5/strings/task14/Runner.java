package javaclub5.strings.task14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * All Star Code Challenge
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static int strCount(String str, char letter) {

        return (int) str.chars().filter(x -> x == letter).count();
    }

    public static void start(BufferedReader br) {
        try {
            System.out.println("In this task we will try to find amount of letters in the word.");
            System.out.println("Enter word: ");
            String str = br.readLine();
            System.out.println("Enter letter: ");
            String letter = br.readLine();
            if (letter.length() != 1) {
                throw new IllegalArgumentException();
            }
            char let = letter.charAt(0);
            System.out.println(strCount(str, let));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }
}

