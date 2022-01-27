package javaclub5.conditions.task19;

import java.util.Scanner;

public class Task19 {
    public static void start(Scanner scanner) {
        System.out.println("Enter a number ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a number ");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a number ");
        int y = Integer.parseInt(scanner.nextLine());

        System.out.println("Result: " + isDivisible(n, x, y));
    }

    public static boolean isDivisible(int n, int x, int y) {
        if (n > 0 && x > 0 && y > 0) {
            return n % x == 0 && n % y == 0;
        } else {
            return false;
        }
    }
}
