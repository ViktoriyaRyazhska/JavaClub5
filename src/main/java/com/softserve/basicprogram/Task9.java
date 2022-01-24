package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start9TaskBasicProgram;

public class Task9 extends ReadConsole {
    static int number;

    public static void main(String[] args) {
        start9TaskBasicProgram();

        try {
            number = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Result: " + makeNegative(number));

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

    public static int makeNegative(final int a) {
        return (a < 0) ? a : -a;
    }

}
