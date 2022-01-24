package main.basicprogram.task54;

import main.InterfaceTestClass;

import java.util.Scanner;

public class OppositeNumb implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static int opposite(int number)
    {
        return -number;
    }
    @Override
    public void execute() {
        System.out.println("Very simple, given an integer "+"" +
                "or a floating-point number, find its opposite.");

        System.out.println("Write your number: ");
        int number = scanner.nextInt();
    }
}
