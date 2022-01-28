package main.loops.task32;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;

import java.util.Scanner;

public class Solution implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static String repeatStr(final int repeat, final String string) {
        String s = "";
        for (int i = 0; i < repeat; i++) s += string;
        return s;

    }

    @Override
    public void execute() {
        System.out.println("Implement a function which called repeatStr which repeats the given string string exactly n times.");
        System.out.println("You must enter a digit and a word. ");

        try {

            System.out.println("Lets enter a string: ");
            String s = scan.nextLine();
            System.out.println("Lets enter digit: ");
            int repeat = scan.nextInt();
            System.out.println("Your answer is: ");
            System.out.println(Solution.repeatStr(repeat, s));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}