package javaclub5.strings.task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/
 * toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for details)
 * such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:
 * <p>
 * StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
 * StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
 * StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
 * StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
 * StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
 * StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
 * StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"
 * <p>
 * As usual, your function/method should be pure, i.e. it should not mutate the original string.
 *
 * @author Popova Anna
 */


public class Runner {

    public static void start(BufferedReader br) {
        System.out.println("This task is for changing the letters case in the word to the opposite." +
                "\nEnter some word to change it case: ");
        try {
            String input = br.readLine();
            System.out.println("Your changed case in the word: " + changingLetterCase(input));
        } catch (IOException ex) {
            System.out.println("Wrong input.");
        }
    }

    public static String changingLetterCase(String word) {
        String changedCaseInWord = "";

        char[] charArray = word.toCharArray();
        for (char w : charArray) {
            if (Character.isUpperCase(w)) {
                changedCaseInWord += Character.toLowerCase(w);
            } else {
                changedCaseInWord += Character.toUpperCase(w);
            }
        }
        return changedCaseInWord;
    }
}
