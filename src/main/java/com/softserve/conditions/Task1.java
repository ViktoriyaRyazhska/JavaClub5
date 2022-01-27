package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start1TaskConditions;

public class Task1 extends ReadConsole {

    static double number;

    public static void main(String[] args) {

        start1TaskConditions();
        try {
            number = Double.parseDouble(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> Wrong input!! Try again! <==");
            Task1.main(args);
        }
        System.out.println("Result: " + opposite((int) number));

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

    public static int opposite(int number) {
        if (number == 0) {
            return 0;
        } else
            return (number > 0) ? number * (-1) : Math.abs(number);
    }

}
