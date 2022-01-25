package javaclub5.conditions.task26;

import java.util.Scanner;

public class Task26 {
    public static void start(Scanner scanner) {

        System.out.println("Input what bool think u want back. Set (True) for Yes or (False) for No: ");
        try {
            boolean bool = Boolean.getBoolean(scanner.nextLine());
            System.out.println("Answer is:" + boolWorld(bool));
        } catch (Exception e) {

        }
    }

    public static String boolWorld(boolean b) {
        if (b) {
            return "Yes";
        }
        return "No";
    }
}
