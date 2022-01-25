package main.java.com.softserve.basicprogram;

import java.io.IOException;
import java.math.BigInteger;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start1TaskBasicProgram;

public class Task1 extends ReadConsole {

    static BigInteger b;

    public static void main(String[] args) throws IOException {

        start1TaskBasicProgram();
        try {
            b = new BigInteger(br.readLine());
            System.out.println("Double the number = " + doubleTheNumber(b));
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not an integer! Try again! <==");
            Task1.main(args);
        }

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

    public static BigInteger doubleTheNumber(BigInteger b) {
        return b.add(b);
    }

}