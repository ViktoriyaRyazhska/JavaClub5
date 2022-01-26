package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start6TaskBasicProgram;

public class Task6 extends ReadConsole {

    static int number;

    public static void main(String[] args) throws IOException {
        start6TaskBasicProgram();

        try {
            number = Integer.parseInt(br.readLine());
            System.out.println("Result: " + toBinary(number));
        } catch (IOException e) {
            e.printStackTrace();
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
                    Task6.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static int toBinary(int number) {
        return Integer.parseInt(Integer.toBinaryString(number));
    }
}
