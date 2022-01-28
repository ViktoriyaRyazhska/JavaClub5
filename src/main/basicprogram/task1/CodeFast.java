package main.basicprogram.task1;

import java.util.Scanner;

import main.InterfaceTestClass;

public class CodeFast implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);



    public static int doubleInteger(int i) {

        i*=2;
        return i;

    }

    @Override
    public void execute() {
        System.out.println("Code as fast as you can! You need to double the integer and return it");
        System.out.println("Enter some number: ");

        try {
            CodeFast.doubleInteger(scanner.nextInt());
        }
        catch (Exception e) {
            System.out.println("Check if your input is correct");
            System.err.println(e.getMessage());
        }
    }
}