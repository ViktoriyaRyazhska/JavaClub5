package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start4TaskBasicProgram;

public class Task4 extends ReadConsole {

       static String name;

    public static void main(String[] args) throws IOException {
        start4TaskBasicProgram();

        try {
            name = br.readLine();
            System.out.println(greet(name));
        } catch (IOException e) {
            e.printStackTrace();
            Task4.main(args);
        }

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task4.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task4.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String greet(String name){return String.format("Hello, %s!", name);
    }
}
