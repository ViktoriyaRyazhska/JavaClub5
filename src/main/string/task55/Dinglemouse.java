package main.string.task55;

import main.InterfaceTestClass;

import java.util.Scanner;

public class Dinglemouse implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String replaceDots(final String str) {
        return str.replace(".", "-");
    }

    @Override
    public void execute() {
        System.out.println("The code provided is supposed replace all the dots \".\" in the specified String str with dashes \"-\"");
        System.out.println("Write some text. After that I'll replace all dots for you.");
        String replacer = scanner.nextLine();
        System.out.println(Dinglemouse.replaceDots(replacer));
    }
}
