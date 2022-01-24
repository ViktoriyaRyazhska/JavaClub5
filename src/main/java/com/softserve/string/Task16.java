package main.java.com.softserve.string;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

public class Task16 extends ReadConsole {
    static String input;
    public static void main(String[] args) {
        System.out.println("Task 16 Runs from now");
        System.out.println("Enter a string to change some letters in it:");
        System.out.println("Enter only with high register");

        try {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println("You are doing something wrong!");
        }
        System.out.println("Now we have some letter changed!");
        System.out.println(correct(input));

        System.out.println("Beak to main menu => input 1 ");
        System.out.println("Try again  => input 2 ");

        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                case "2":
                    Task16.main(args);
                    break;
                default:
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task16.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String correct(String string) {

        return string.replace("S","5").replace("O","0").replace("I","1");
    }
}