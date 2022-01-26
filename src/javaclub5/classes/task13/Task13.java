package javaclub5.classes.task13;

import java.util.Scanner;

public class Task13 {

    public static final Task13 INST = new Task13();

    private static int ONE_HUNDRED = 100;

    private static int value = ONE_HUNDRED;

    private Task13() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(Scanner scanner) {
        System.out.println("Input a number to add 100: ");
        try {
            int n = scanner.nextInt();
            System.out.println("Result: " + Task13.INST.plus100(n));
        }catch (Exception e) {

            System.out.println("Put correct number");

        }
    }

}


