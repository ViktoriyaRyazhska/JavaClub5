package main.basicprogram.task2;

import main.InterfaceTestClass;

import java.util.Scanner;

public class Kata3 implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }



    @Override
    public void execute() {
        System.out.println("Implement a function which multiplies two numbers.");
        System.out.println("You must enter two digits. ");
        System.out.println("Lets enter first digit: ");
        int first = scan.nextInt();
        System.out.println("Lets enter second digit: ");
        int second = scan.nextInt();
        System.out.println(Kata3.multiply(first,second));
    }
}
