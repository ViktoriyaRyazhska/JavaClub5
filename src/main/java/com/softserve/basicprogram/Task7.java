package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start7TaskBasicProgram;


public class Task7 extends ReadConsole {

    static int hours;
    static int minutes;
    static int seconds;

    public static void main(String[] args) {
        start7TaskBasicProgram();

        try {
            hours = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("==> Wrong input! Try again! <==");
            Task7.main(args);
        }
        System.out.println("Enter minutes:");
        try {
            minutes = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException exception) {
            System.out.println("==> Wrong input! Try again! <==");
            Task7.main(args);
        }
        System.out.println("Enter seconds:");
        try {
            seconds = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException exception) {
            System.out.println("==> Wrong input! Try again! <==");
            Task7.main(args);
        }

        System.out.println("Result: " + enterTime(hours, minutes, seconds));

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
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task7.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int enterTime(int h, int m, int s) {
        return (s * 1000) + (m * 60000) + (h * 3600000);
    }


}