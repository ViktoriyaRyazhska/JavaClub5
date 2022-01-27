package main.java.com.softserve.loops;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;
import java.util.Arrays;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start9TaskLoop;

public class Task9 extends ReadConsole {

    static int sizeArray;
    static int number;

    public static void main(String[] args) throws IOException {

        start9TaskLoop();
        try {
            sizeArray = Integer.parseInt(br.readLine());
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Wrong input!");
        }

        int[] arr = new int[sizeArray];
        System.out.println("Enter number that will be stored there");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            number = Integer.parseInt(br.readLine());
            arr[i] = number;
        }
        System.out.println("Now lets count sum of all positives!");
        System.out.println("Result: " + sum(arr));

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                case "2":
                    Task9.main(args);
                    break;
                default:
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task9.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }

}

