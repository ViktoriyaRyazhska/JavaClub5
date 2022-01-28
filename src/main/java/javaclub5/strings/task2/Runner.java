package javaclub5.strings.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Complete the solution so that it reverses the string passed into it.
 *
 * @author Popova Anna
 */

public class Runner {

    public static void start(BufferedReader br) {
        System.out.println("In this task we gonna reverse the word.\nEnter the word: ");
        String word = null;
        try {
            word = br.readLine();
        } catch (IOException e) {
            System.out.println("Smth wrong.");
        }
        System.out.println("Normal word " + word + ".");
        System.out.println("Reversed word: " + reversed(word) + ".");
    }

    public static String reversed(String word) {
        String reversedWord = "";
        char w;

        for (int i = 0; i < word.length(); i++) {
            w = word.charAt(i);
            reversedWord = w + reversedWord;
        }
        return reversedWord;
    }
}
