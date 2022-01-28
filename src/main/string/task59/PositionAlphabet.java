package main.string.task59;

import main.InterfaceTestClass;

import java.util.Scanner;

public class PositionAlphabet implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static String position(int number)
    {
        String a = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = a.toCharArray();
        return String.valueOf(chars[number]);
    }


    @Override
    public void execute() {
        System.out.println("When provided with a letter, return its position in the alphabet.");
        System.out.println("Write your number: ");
        int number = scanner.nextInt();
        System.out.println(PositionAlphabet.position(number));

    }
}
