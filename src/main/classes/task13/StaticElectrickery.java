package main.classes.task13;

import main.InterfaceTestClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StaticElectrickery implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static final StaticElectrickery INST = new StaticElectrickery();

    private static final int ONE_HUNDRED = 100;

    private static int value;

    public StaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public static int plus100(int n) {
        return value + n;
    }

    @Override
    public void execute() {
        int n;
        System.out.println("Please enter the value you want to increase by 100:");
        try {
            n = scanner.nextInt();
            System.out.println("Result: " + StaticElectrickery.plus100(n));
        } catch (InputMismatchException | NumberFormatException e){
            System.out.println("Wrong input!");
        }
    }
}
