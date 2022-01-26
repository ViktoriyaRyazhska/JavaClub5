package javaclub5.loops.task35;

import java.util.Scanner;

public class Task35 {

    public static void start(Scanner scanner) {
        System.out.println("Enter three numbers: ");
        try {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
            int[] ints = valueDoubled(a, b, c);
            System.out.println("Double " + a + " is " + ints[0] + "\n"
                    + "Double " + b + " is " + ints[1] + "\n"
                    + "Double " + c + " is " + ints[2] + "\n");

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    public static int[] valueDoubled(int a, int b, int c) {
        int[] ints = {a, b, c};
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i] * 2;
        }
        return ints;
    }
}
