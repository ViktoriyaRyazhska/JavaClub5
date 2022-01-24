package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start8TaskBasicProgram;

public class Task8 extends ReadConsole {

    static int century;

    public static void main(String[] args) {
        start8TaskBasicProgram();

        if (isInteger()) {
            System.out.println("Result :" + century(century));
        } else {
            System.out.println("==> It's not an integer! Try again! <==");
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
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task8.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int century(int number) {
        if (number % 100 == 0) {
            return number / 100;
        } else if (number % 100 != 0) {
            return (number / 100) + 1;
        }
        return number / 100;
    }

    protected static boolean isInteger() {
        try {
            century = Integer.parseInt(br.readLine());
            return true;
        } catch (NumberFormatException | IOException e) {
            return false;
        }
    }
}
