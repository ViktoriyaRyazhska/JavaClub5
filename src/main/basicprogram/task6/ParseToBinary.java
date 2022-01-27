package main.basicprogram.task6;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.util.Scanner;

public class ParseToBinary implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int toBinary(int n) {
        String temp =  Integer.toBinaryString(n);
        return Integer.parseInt(temp);
    }

    @Override
    public void execute() {
        System.out.println("Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.");
        System.out.println("Enter some number: ");
        try {
            ParseToBinary.toBinary(scanner.nextInt());
        }
        catch (Exception e) {
            System.out.println("Check if your input is correct");
            System.err.println(e.getMessage());
        }
    }
}
