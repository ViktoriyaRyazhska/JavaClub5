package main.java.com.softserve.loops;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;
import java.util.Arrays;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start2TaskLoops;

public class Task2 extends ReadConsole {
    static int catYears;
    static int dogYears;
    static int humanYears;

    public static void main(String[] args) {

        start2TaskLoops();
        try {
            humanYears = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> Wrong input!!=) Try again! <==");
            Task2.main(args);
        }

        System.out.println("Lets se how old are u as a cat and as a dog");
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(humanYears)));

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
                    Task2.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        } else if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;
        } else if (humanYears >= 3) {
            catYears = (4 * (humanYears - 2) + 24);
            dogYears = (5 * (humanYears - 2) + 24);
        }
        return new int[]{humanYears, catYears, dogYears};
    }

}
