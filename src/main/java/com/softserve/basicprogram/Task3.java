package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start3TaskBasicProgram;

public class Task3 extends ReadConsole {
    static double length;
    static double width;
    static double height;

    public static void main(String[] args) {

        start3TaskBasicProgram();
        try {
            length = Double.parseDouble(br.readLine());
            width = Double.parseDouble(br.readLine());
            height = Double.parseDouble(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not a Double value! Try again! <==");
            Task3.main(args);
        }
        System.out.println("You have entered : " + length + " " + width + " " + height);
        System.out.println("Result: " + getVolumeOfCuboid(length, width, height));

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
                    Task3.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        if (length > 0 && width > 0 && height > 0) {
            return length * width * height;
        } else return 0;
    }
}



