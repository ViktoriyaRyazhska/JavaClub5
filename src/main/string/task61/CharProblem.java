package main.string.task61;

import main.InterfaceTestClass;
import main.basicprogram.task11.GrassHopper;

import java.util.Scanner;

public class CharProblem implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int howOld(final String herOld) {
        int age = Character.getNumericValue(herOld.charAt(0));
        return age;
    }


    @Override
    public void execute() {
        System.out.println("Ask a small girl - \"How old are you?\". She always says strange things... Lets help her!\n" +
                "For correct answer program should return int from 0 to 9.");
        System.out.println("Enter age of small girl: ");
        System.out.println(CharProblem.howOld(scanner.nextLine()));
    }
}