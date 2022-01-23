package javaclub5.basicprogram.task1;

import java.util.Scanner;

public class Task1 {

    public static void start(Scanner scanner) {
        System.out.println("Write a number to double it: ");
        try {
            System.out.println(doubleInteger(scanner.nextInt()));
        } catch (Exception e) {

        }
    }

    public static int doubleInteger(int i) {
        return i * 2;
    }
}
