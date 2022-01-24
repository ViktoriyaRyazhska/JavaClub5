package javaclub5.string.task55;

import java.util.Scanner;

public class Task55 {
    /*
    The code provided is supposed replace all the dots . in the specified String str with dashes -
    But it's not working properly.

    Task
    Fix the bug so we can all go home early.

    Notes
    String str will never be null.
     */

        public static String replaceDots(final String str) {
            return str.replaceAll("\\.", "-");
        }

    public static void main(Scanner scanner) {
        System.out.println("Enter sentence with dots and they will be replaced with '-' : ");
        String sentence = scanner.nextLine();
        String newSentence = replaceDots(sentence);
        System.out.println(newSentence);
    }
    }

