package main.conditions.task18;

import main.InterfaceTestClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OppositeNumber implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int opposite(int number) {
        return (-number);
    }

    @Override
    public void execute() {
        int number;
        System.out.println("Please enter the number you want to know opposite:");
        try {
            number = scanner.nextInt();
            System.out.println("Result: " + number + " -> " + OppositeNumber.opposite(number));
        }catch (InputMismatchException | NumberFormatException e){
            System.out.println("Wrong input!");
        }
    }
}

