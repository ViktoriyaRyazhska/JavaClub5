package javaclub5.string.task68;

import java.util.Scanner;

public class Task68 {
    public static void start(Scanner scanner) {
        System.out.println("Enter some words with exclamation marks: ");
        try {
            String word = scanner.nextLine();
            System.out.println("Enter number to remove some exclamation marks: ");
            int remove = Integer.parseInt(scanner.nextLine());

            System.out.println(removeExclamation(word, remove));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }


    public static String removeExclamation(String word, int remove) {

        for (int i = 0; i < remove; i++) {
            int j = word.indexOf("!");
            word = word.substring(0, j) + word.substring(j + 1);
        }
        return word;
    }
}
