package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start6TaskConditions;

public class Task6 extends ReadConsole {
    static String p1;
    static String p2;

    public static void main(String[] args) {

        start6TaskConditions();
        try {
            p1 = br.readLine();
            System.out.println("Enter player 2 choice");
            p2 = br.readLine();
            System.out.println("Result: " + rps(p1, p2));
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> Wrong input!!=) Try again! <==");
            Task6.main(args);
        }

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task6.main(args);
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

    public static String rps(String p1, String p2) {

        if (p1.equals(p2)) {
            return "Draw!";
        }
        else if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        }
        else if  (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        }
        else if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        }
        else {
            return "Player 2 won!";
        }
    }
}
