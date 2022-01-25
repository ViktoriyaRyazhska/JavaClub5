package main.java.com.softserve.conditions;


import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start9TaskConditions;

public class Task9 extends ReadConsole {
        static boolean trueOrFalse;
        static int choice;

        public static void main(String[] args) {

            start9TaskConditions();

            try {
                choice = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("Bad input!");
            }
            trueOrFalse = makeChoice(choice);

            System.out.println("Result : " + isBool(trueOrFalse));

            backToMenuOrRetry();

            try {
                switch (br.readLine()) {
                    case "1":
                        MainClass.main(args);
                        break;
                    case "2":
                        Task9.main(args);
                        break;
                    default:
                        System.err.println("You need to do this: put 1 or 2 ");
                        System.err.println("Transfer to menu ");
                        Task9.main(args);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        public static String isBool(boolean b) {
            return b ? "Yes" : "No";
        }

        public static boolean makeChoice(int s) {
            if (s == 1) return true;
            else return false;
        }
    }

