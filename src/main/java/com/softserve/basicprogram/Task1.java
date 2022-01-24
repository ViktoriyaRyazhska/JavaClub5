package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

public class Task1 extends ReadConsole {

    static BigInteger b;

    public static void main(String[] args) {

        message1();
        if (isBigInteger(br)) {
            System.out.println("Double Integer = " + (b.add(b)));

        } else {
            System.out.println("==> It's not an integer! Try again! <==");
            Task1.main(args);
        }

        message2();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task1.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task1.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void message1() {
        System.out.println("\nTask is starting!");
        System.out.println("You need to enter an integer and double it !!!");
        System.out.println("Please input integer number: ");
    }

    public static void message2() {
        System.out.println("\nBack to main menu => input 1 ");
        System.out.println("Try again  => input 2 ");
    }

    public static boolean isBigInteger(BufferedReader br) {
        try {
            b = new BigInteger(br.readLine());
            return true;
        } catch (NumberFormatException | IOException e) {
            return false;
        }
    }

}
