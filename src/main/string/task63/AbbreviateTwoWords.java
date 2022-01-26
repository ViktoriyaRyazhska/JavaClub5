package main.string.task63;

import main.InterfaceTestClass;

import java.util.Scanner;

public class AbbreviateTwoWords implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String[] arr = name.split(" ");
        return arr[0].charAt(0) + "." + arr[1].charAt(0);
    }

    @Override
    public void execute() {
        System.out.println("Please write your name and surname(like this: Sam Harris):");
        String name = scanner.nextLine();
        System.out.println("Abbreviate a two word name: " + AbbreviateTwoWords.abbrevName(name));
    }
}
