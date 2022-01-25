package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start10TaskConditions;

public class Task10 extends ReadConsole {

    public static int cap;
    public static int on;
    public static int wait;

    public static void main(String[] args) {

        start10TaskConditions();
        System.out.println("Enter cap:");
        try {
            cap = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("U did something wrong!\nTry again =)");
            Task10.main(args);
        }

        System.out.println("Enter number of people on the bus excluding the driver. ");

        try {
            on = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Try again =)");
            Task10.main(args);
        }

        System.out.println("Enter number of people waiting to get on to the bus");
        try {
            wait = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Wrong input! Do it again!");
            Task10.main(args);
        }
        System.out.println("If result = 0, its enough.");
        System.out.println("Result: "+enough(cap,on,wait));

        backToMenuOrRetry();

        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                case "2":
                    Task10.main(args);
                    break;
                default:
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task10.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static int enough(int cap,int on, int wait){
        int cant = cap-on-wait;
        return cant >= 0 ? 0 : Math.abs(cant);
    }
}
