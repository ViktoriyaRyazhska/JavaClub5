package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start5TaskBasicProgram;

public class Task5 extends ReadConsole {

    static String name;

    public static void main(String[] args) throws IOException {
        start5TaskBasicProgram();

        try {
            name = br.readLine();
            System.out.println(greet(name));
        } catch (IOException e) {
            e.printStackTrace();
            Task5.main(args);
        }

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task5.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task5.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }
}