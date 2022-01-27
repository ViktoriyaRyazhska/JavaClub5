package main.java.com.softserve.loops;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start3TaskLoops;


public class Task3 extends ReadConsole {

    static int sum;
    static int sizeOfArray;

    public static void main(String[] args) {

        start3TaskLoops();
        try {
            sizeOfArray = Integer.parseInt(br.readLine());
            if (sizeOfArray <= 0) {
                System.out.println("Cant be Zero or less! ");
                System.out.println("Try again!");
                Task3.main(args);
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> Wrong INPUT! Try again! <==");
            Task3.main(args);
        }
        System.out.println("Now lets add marks:");
        int[] marks = new int[sizeOfArray];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter " + (i + 1) + " mark");
            try {
                marks[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("Wrong input! Try again ");
                Task3.main(args);
            }
        }
        System.out.println("Now lets se the result");
        System.out.println("Average: " + getAverage(marks));

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

    public static int getAverage(int[] marks) {
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

}
