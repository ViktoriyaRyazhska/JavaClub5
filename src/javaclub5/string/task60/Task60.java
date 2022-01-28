package javaclub5.string.task60;

import java.util.Scanner;

public class Task60 {

    public static void start(Scanner scanner) {
        System.out.println("Enter some numbers in one line: ");
        try {
            String numbers = scanner.nextLine();

            System.out.println(fakeBin(numbers));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }


    public static String fakeBin(String numberString) {
        numberString = numberString.replaceAll("[0-4]", "0");
        numberString = numberString.replaceAll("[5-9]", "1");
        return numberString;
    }

}