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
        System.out.println("You must enter two digits. ");
        System.out.println("Lets enter first digit: ");
        try {
            int repeat = scan.nextInt();
            System.out.println("Lets enter second digit: ");
            String str = scan.nextLine();
            System.out.println(Solution.repeatStr(repeat, str));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}