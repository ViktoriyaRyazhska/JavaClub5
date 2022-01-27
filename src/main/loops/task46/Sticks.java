package main.loops.task46;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.io.IOException;
import java.util.Scanner;

public class Sticks implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int makeMove(int sticks) {
        return sticks % 4;

    }

    @Override
    public void execute() {
        System.out.println("In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks. The last person to take a stick wins. For example:");
        System.out.println("21 sticks in the pile\n" +
                "Bob takes 2  -->  19 sticks left\n" +
                "Jim takes 3  -->  16 sticks\n" +
                "Bob takes 3  -->  13 sticks\n" +
                "Jim takes 1  -->  12 sticks\n" +
                "Bob takes 2  -->  10 sticks\n" +
                "Jim takes 2  -->   8 sticks\n" +
                "Bob takes 3  -->   5 sticks\n" +
                "Jim takes 3  -->   2 sticks\n" +
                "Bob takes 2  -->  Bob wins!");
        System.out.println("Create a robot that will always win the game. Your robot will always go first. The function should take an integer and returns 1, 2, or 3.");
        System.out.println("There are 21 sticks on table");
        System.out.println("Robot starts the game and makes first move, and takes 1 stick");
        System.out.println("Now on table are 20 sticks on table");
        int sticks = 20;
//        int number = makeMove(sticks);
//        System.out.printf("I'll take %d sticks\n", number);
//        sticks -= number;
//        System.out.printf("%d sticks left in game \n", sticks);
        System.out.println("Now is your move and you can take 1, 2 or 3 sticks");
        while (sticks != 0) {
            try {
                System.out.println("Please choose number of sticks you wanna take");
                int number = scanner.nextInt();
                if (number > 3 || number < 1) {
                    System.out.println("Should be 1,2 or 3");
                    continue;
                }
                sticks -= number;
                System.out.printf("%d sticks after your move \n", sticks);
                number = makeMove(sticks);
                System.out.printf("Robot takes %d sticks\n", number);
                sticks -= number;
                System.out.printf("%d sticks after robot move  \n", sticks);
            } catch (NumberFormatException e) {
                System.out.println("Should be 1,2 or 3");
            }
        }
        System.out.println("Robot win!!!");


    }
}