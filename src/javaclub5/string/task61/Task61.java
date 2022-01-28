package javaclub5.string.task61;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            start(sc);
        }

        public static void start(Scanner scanner) {
            System.out.println("Ask a small girl - How old are you?");
            System.out.println("*Assume test input string always valid and may look like " +
                    "\"1 year old\" or \"5 years old\", etc.. The first char is number only.*");
            try {
                String year = scanner.nextLine();
                System.out.println("Result: " + howOld(year));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        public static int howOld(String herOld) {
            char ch1 = herOld.charAt(0);
            int a;
            a = ch1 - '0';
            return a;
        }
}
