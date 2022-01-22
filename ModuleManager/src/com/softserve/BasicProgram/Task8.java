package com.softserve.BasicProgram;

import com.softserve.MainClass;

import java.io.BufferedReader;
import java.io.IOException;

import static com.softserve.Input.br;

public class Task8 {

    static  int century;

    public static void main(String[] args) {
        System.out.println("Task 8 is starting");
        System.out.println("Enter the year to find out what this century is ;)");

        if (isInteger(br)){
            System.out.println("Result :"+century(century));
        }else {
            System.out.println("==> It's not an integer! Try again! <==");
            Task8.main(args);
        }

        System.out.println("Beak to main menu => input 1 ");
        System.out.println("Try again  => input 2 ");
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

    protected static boolean isInteger(BufferedReader br) {
        try {
            century = Integer.parseInt(br.readLine());
            return true;
        } catch (NumberFormatException | IOException e) {
            return false;
        }
    }
}
