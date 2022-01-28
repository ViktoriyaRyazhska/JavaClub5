package main.basicprogram.task10;

import main.InterfaceTestClass;
import main.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kata implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String datingRange(int age) {
        int min = age / 2 + 7;
        int max = (age - 7) * 2;

        if (age <= 14) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
        }
        return min + "-" + max;
    }

    @Override
    public void execute() {
        int age = 0;
        System.out.println("Everybody knows the classic \"half your age plus seven\" " +
                "dating rule that a lot of people follow (including myself). \n" +
                "It's the 'recommended' age range in which to date someone. ");
        System.out.println("Let's see...");
        System.out.println("Write your age: ");
        try {
            age = scanner.nextInt();
            System.out.println("Recommended interval: " + Kata.datingRange(age));
        }catch (InputMismatchException | NumberFormatException  exception){
            System.out.println("Wrong input");
        }
    }
}
