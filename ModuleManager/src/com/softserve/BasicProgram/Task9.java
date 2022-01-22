package com.softserve.BasicProgram;

import com.softserve.MainClass;

import java.io.IOException;

import static com.softserve.Input.br;

public class Task9 {
    static int number;

    public static void main(String[] args) {
        System.out.println("Task 9 is starting");
        System.out.println("Enter number to get negative:");

        try {
            number = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Result: " + makeNegative(number));

        System.out.println("Beak to main menu => input 1 ");
        System.out.println("Try again  => input 2 ");
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                case "2":
                    Task9.main(args);
                    break;
                default:
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task9.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int makeNegative(final int a) {
        return (a < 0) ? a : -a;
    }
}
