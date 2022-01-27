package main.string.task51;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;
import main.basicprogram.task11.GrassHopper;

import java.util.Scanner;

public class NumberToString implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    @Override
    public void execute() {
        System.out.println("We need a function that can transform a number into a string.");
        System.out.println("Enter some number: ");
        try {
            System.out.println(NumberToString.numberToString(scanner.nextInt()));
        }
        catch (Exception e) {
            System.out.println("Check if your input is correct");
            System.err.println(e.getMessage());
        }
    }
}