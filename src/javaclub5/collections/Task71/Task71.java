package javaclub5.collections.Task71;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Task71 {
    public static void start(Scanner scanner) {
        System.out.println("This task is for changing the letters case in the word to the opposite." +
                "\nEnter some word to change it case: ");
        try {
            String input = scanner.nextLine();
            System.out.println("Your changed case in the word: " + changingLetterCase(input));
        } catch (Exception e) {
            System.out.println("Wrong input.");
            e.getStackTrace();
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
