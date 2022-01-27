package main.java.com.softserve.string;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start1TaskStrings;

public class Task1 extends ReadConsole {

    static String str;
    static int number;

    public static void main(String[] args) {

        start1TaskStrings();
        try {
            str = br.readLine();
            if (isNumber(str)) {
                number = Integer.parseInt(str);
                str = numberToString(number);
                System.out.println("Number entered: " + number + ", string returns: " + "'" + str + "'");
            } else {
                System.out.println("==> It's not a number! Try again! <==");
                Task1.main(args);
            }

        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not a number! Try again! <==");
            Task1.main(args);
        }

        backToMenuOrRetry();
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

    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

}
