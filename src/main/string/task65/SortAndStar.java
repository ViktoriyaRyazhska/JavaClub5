package main.string.task65;

import main.InterfaceTestClass;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndStar implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***",s[0].split(""));
    }

    @Override
    public void execute() {
        System.out.println("You will be given a vector of strings. I'll sort it alphabetically \n(case-sensitive, and based on the ASCII values of the chars) and then return the first value.");
        System.out.println("The returned value will be a string, and have \"***\" between each of its letters.");
        System.out.println("Specify some words combining with \" ENTER \"");
        System.out.println("How many word you will specify?");
        int counter = scanner.nextInt();
        System.out.println("I will create Array for you");
        String [] strArr = new String[counter];
        System.out.println("Please specify " + counter + " words.");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scannerString.nextLine();
        }
        System.out.println(SortAndStar.twoSort(strArr));
    }
}
