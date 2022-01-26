package main.java.com.softserve.basicprogram;

import java.io.IOException;
import java.math.BigInteger;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;
import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start2TaskBasicProgram;

public class Task2 extends ReadConsole {

    static BigInteger numB1;
    static BigInteger numB2;

    public static void main(String[] args) {

        start2TaskBasicProgram();
        System.out.print("first number = ");
        numB1 = parseNum(numB1);
        System.out.print("second number = ");
        numB2 = parseNum(numB2);
        BigInteger result = multiplyTwoNums(numB1, numB2);
        System.out.println("Multiplication result = " + result);

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


    public static BigInteger parseNum(BigInteger i) {
        try {
            i = new BigInteger(br.readLine());
            if (i.equals(BigInteger.valueOf(0))) {
                System.out.println("Warning! entered 0. Result will be ZERO");
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not an integer! Try again! <==");
            Task2.main(new String[0]);
        }
        return i;
    }

    public static BigInteger multiplyTwoNums(BigInteger numB1, BigInteger numB2) {
        return numB1.multiply(numB2);
    }

}
