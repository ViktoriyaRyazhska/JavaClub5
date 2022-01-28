package javaclub5.loops.task46;

import java.util.Scanner;

public class Task46 {

        public static void start(Scanner scanner) {
            System.out.println("In this game, there are 21 sticks lying in a pile. " +
                    "Players take turns taking 1, 2, or 3 sticks. The last person to take a stick wins.");
            int sticks = 21;
            int number = getMove(sticks);
            System.out.printf("I'll take %d sticks ", number);
            sticks -= number;
            System.out.printf("%d sticks left in game ", sticks);
            System.out.print("You can take 1 or 2 or 3 sticks ");
            while (sticks != 0) {
                System.out.println("You'll take?");
                number = Integer.parseInt(scanner.nextLine());
                if (number > 3 || number < 1) {
                    System.out.println("Write another imput");
                    continue;
                }
                sticks -= number;
                System.out.printf("%d sticks left in game \n", sticks);
                number = getMove(sticks);
                System.out.printf("I'll take %d sticks\n", number);
                sticks -= number;
                System.out.printf("%d sticks left in game \n", sticks);
            }
            System.out.println("I won");
        }

        public static int getMove(int sticks) {
            return sticks - (sticks / 4) * 4;
        }
}
