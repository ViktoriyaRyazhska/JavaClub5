package main.java.com.softserve.loops;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;
import java.util.Objects;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start1TaskLoops;

public class Task1 extends ReadConsole {
    static int times;
    static String entered;

    public static void main(String[] args) {

        start1TaskLoops();
        try {
            entered = br.readLine();
            System.out.println("How many times to repeat? Enter number!");
            times = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("You have entered something wrong! Try again!");
            Task1.main(args);
        }
        System.out.println("Now lets se what happens:");
        System.out.println("Result: " + repeatStr(times, entered));

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

    public static String repeatStr(final int repeat, final String string) {
        if (repeat == 0) {
            return "";
        }
        if (Objects.equals(string, "")) {
            return string;
        }

        return string.repeat(repeat);
    }

}
