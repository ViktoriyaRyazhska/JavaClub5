package main.java.com.softserve.string;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start4TaskStrings;

public class Task4 extends ReadConsole {

    static String str;
    static int numberInt;
    static double numberDouble;

    public static void main(String[] args) {

        start4TaskStrings();
        try {
            str = br.readLine();
            if (isNumeric(str)) {
                if (isInteger(str) != 0) {
                    System.out.print("Result: " + oppositeInt(isInteger(str)));
                }
                if (isDouble(str) != 0 && isInteger(str) == 0) {
                    System.out.print("Result: " + oppositeDouble(isDouble(str)));
                }
                if (isInteger(str) == 0 && isDouble(str) == 0) {
                    System.out.println("Result: " + "ZERO");
                }
            } else {
                System.out.println("==> It's not numeric value! Try again! <==");
                Task4.main(args);
            }
        } catch (IOException e) {
            System.out.println("==> ERROR! <==");
            Task4.main(args);
        }

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task4.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task4.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("^(?:(?:\\-{1})?\\d+(?:\\.{1}\\d+)?)$");
    }

    public static int isInteger(String str) {
        try {
            numberInt = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
        return numberInt;
    }

    public static double isDouble(String str) {
        try {
            numberDouble = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return 0;
        }
        return numberDouble;
    }

    public static int oppositeInt(int i) {
        return i == 0 ? i : -i;
    }

    public static double oppositeDouble(double d) {
        return d == 0 ? d : -d;
    }

}
