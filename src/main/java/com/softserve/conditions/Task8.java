package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start8TaskConditions;

public class Task8 extends ReadConsole {

    static int flower1;
    static int flower2;

    public static void main(String[] args) {

        start8TaskConditions();
        try {
            flower1 = Integer.parseInt(br.readLine());
            System.out.println("Enter amount of Sarah's petals");
            flower2 = Integer.parseInt(br.readLine());
            if (!isLove(flower1, flower2)) {
                System.out.println("They are not in Love!");
            } else {
                System.out.println("They are in Love!");
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> Wrong input!!=) Try again! <==");
            Task8.main(args);
        }

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task8.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task8.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isLove(final int flower1, final int flower2) {
        int sum = flower1 + flower2;
        return sum % 2 != 0;
    }

}
