package main.basicprogram.task7;

import main.InterfaceTestClass;
import main.basicprogram.task7.Clock;

import java.util.Scanner;

public class Clock implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static int Past(int h, int m, int s) {
        return ((h * 60 * 60) + (m * 60) + s) * 1000;
    }

    @Override
    public void execute() {
        System.out.println("Implement function which returns the time since midnight in milliseconds.");
        System.out.println("You must enter three digits. ");
        System.out.println("Lets enter first digit: ");
        try {
            int first = scan.nextInt();
            System.out.println("Lets enter second digit: ");
            int second = scan.nextInt();
            System.out.println("Lets enter third digit: ");
            int third = scan.nextInt();
            System.out.println(Clock.Past(first, second, third));
        } catch (Exception e) {
            System.out.println("Please check your input.");
        }
    }
}