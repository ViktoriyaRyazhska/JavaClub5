package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;
import main.java.com.softserve.basicprogram.Task1;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start3TaskConditions;

public class Task3 extends ReadConsole {

    static int trueOrFalse;
    static boolean choose;

    public static void main(String[] args) {

        start3TaskConditions();
        try {
            trueOrFalse = Integer.parseInt(br.readLine());
            if (trueOrFalse>2||trueOrFalse<=0){
                System.out.println("You have only 2 choices");
                System.out.println("Try again");
                Task3.main(args);
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not an integer! Try again! <==");
            Task3.main(args);
        }

        choose = convertToBool(trueOrFalse);
        System.out.println("Result of your choice:"+convert(choose));

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task3.main(args);
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
    public static boolean convertToBool(int x){
        return x == 1;
    }

    public static String convert(boolean b){
        return b ? "true" : "false";
    }

}
