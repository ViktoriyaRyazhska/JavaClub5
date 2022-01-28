package javaclub5.strings.task11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ask a small girl - "How old are you?". She always says strange things... Lets help her!
 * For correct answer program should return int from 0 to 9.
 * Assume test input string always valid and may look like "1 year old" or "5 years old", etc.. The first char is number only.
 *
 * @author Dmytro Prudius
 */

public class CharProblem {

    public static void start(BufferedReader br) {

        System.out.println("Ask a small girl - How old are you?");
        System.out.println("*Assume test input string always valid and may look like " +
                "\"1 year old\" or \"5 years old\", etc.. The first char is number only.*");
        try {
            String year = br.readLine();
            System.out.println("Result: " + howOld(year));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }

    public static int howOld(String herOld) {
        char ch1 = herOld.charAt(0);
        int a;
        a = ch1 - '0';
        return a;
    }
}
