package main.basicprogram.task5;

import main.Database;
import main.InterfaceTestClass;
import main.classes.task15.Canvas;

import java.util.Scanner;

public class Greeter implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
        return "Hello, " + name + "!";
    }

    @Override
    public void execute() {
        System.out.println("Jenny has written a function that returns a greeting for a user. \n" +
                "However, she's in love with Johnny, and would like to greet him slightly different. ");
        System.out.println("Write a user name: ");
        System.out.println(Greeter.greet(scanner.nextLine()));
    }
}
