package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start2TaskConditions;

public class Task2 extends ReadConsole {

    static int n;
    static int x;
    static int y;

    public static void main(String[] args) {

        start2TaskConditions();
        try {
            n = Integer.parseInt(br.readLine());
            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());
            System.out.println("Can we? Result: " + isDivisible(n, x, y));
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> Wrong input!!=) Try again! <==");
            Task2.main(args);
        }

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task2.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    main.java.com.softserve.basicprogram.Task1.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isDivisible(long n, long x, long y) {
        if (n > 0 && x > 0 && y > 0) {
            return n % x == 0 && n % y == 0;
        } else return false;
    }

}
