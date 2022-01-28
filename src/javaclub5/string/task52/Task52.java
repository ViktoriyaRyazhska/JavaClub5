package javaclub5.string.task52;

import java.util.Scanner;

    public class Task52 {
        public static void start(Scanner scanner) {
            System.out.println("Enter your word ");
            String word = scanner.nextLine();
            System.out.println("Normal word " + word + ".");
            System.out.println("Reversed word: " + reversed(word) + ".");
        }

        public static String reversed(String word) {
            StringBuilder reversedWord = new StringBuilder();
            char w;

            for (int i = 0; i < word.length(); i++) {
                w = word.charAt(i);
                reversedWord.insert(0, w);
            }
            return reversedWord.toString();
        }
    }
