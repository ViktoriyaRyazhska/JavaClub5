package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start7TaskConditions;

public class Task7 extends ReadConsole {

    static String op;
    static int v1;
    static int v2;

    public static void main(String[] args) {

        start7TaskConditions();
        try {
            op = br.readLine();
            System.out.println("Enter first value: ");
            v1 = Integer.parseInt(br.readLine());
            System.out.println("Enter second value: ");
            v2 = Integer.parseInt(br.readLine());
            if (v2 != 0) {
                System.out.println("Result: " + basicMath(op,v1,v2));
            } else {
                System.out.println("==> Wrong input!!=) Try again! <==");
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> Wrong input!!=) Try again! <==");
            Task7.main(args);
        }

        backToMenuOrRetry();
        try {
        switch (br.readLine()) {
            case "1":
                MainClass.main(args);
                break;

            case "2":
                Task7.main(args);
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

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                throw new IllegalArgumentException("Unknown symbol");
        }
    }
}
