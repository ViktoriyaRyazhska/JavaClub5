package javaclub5.strings.task2;

import java.util.Scanner;

/**
 * Complete the solution so that it reverses the string passed into it.
 *
 * @author Popova Anna
 */

public class Runner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Reversed words.\nEnter the word: ");
        String word = s.nextLine();
        System.out.println("Normal word " + word + ".");
        System.out.println("Reversed word: " + reversed(word) + ".");

    }

    public static String reversed(String word) {
        String reversedWord = " ";
        char w;

        for (int i = 0; i < word.length(); i++) {
            w = word.charAt(i);
            reversedWord = w + reversedWord;
        }
        return reversedWord;
    }
}
