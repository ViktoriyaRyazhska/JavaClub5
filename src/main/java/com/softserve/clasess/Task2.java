package main.java.com.softserve.clasess;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start2classes;


public class Task2 extends ReadConsole {

    public static final Task2 INST = new Task2();

    private static int ONE_HUNDRED = 100;

    private static int value = 100;

    private Task2() {
        value = ONE_HUNDRED;
    }

    public static void main(String[] args) {
        start2classes();

        int number = 0;
        try {
            number = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not an integer! Try again! <==");
            Task2.main(args);
        }
        System.out.println("Result: " + Task2.INST.plus100(number));

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

    public int plus100(int n) {
        return value + n;
    }
}
