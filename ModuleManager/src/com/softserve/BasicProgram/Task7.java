package com.softserve.BasicProgram;

import com.softserve.MainClass;

import java.io.BufferedReader;
import java.io.IOException;

import static com.softserve.Input.br;

public class Task7 {

    static int hours;
    static int minutes;
    static int seconds;

    public static void main(String[] args) {
        System.out.println("Task 7 is starting");
        System.out.println("This function shows the time from midnight in milliseconds");
        System.out.println("Enter hours:");

        try {
            hours = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("==> Wrong input! Try again! <==");
            Task7.main(args);
        }
        System.out.println("Enter minutes:");
        try {
            minutes = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("==> Wrong input! Try again! <==");
            Task7.main(args);
        }
        System.out.println("Enter seconds:");
        try {
            seconds = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("==> Wrong input! Try again! <==");
            Task7.main(args);
        }

        System.out.println("Result: " + enterTime(hours, minutes, seconds));

        System.out.println("Beak to main menu => input 1 ");
        System.out.println("Try again  => input 2 ");
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                case "2":
                    Task7.main(args);
                    break;
                default:
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task7.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int enterTime(int h, int m, int s) {
        return (s * 1000) + (m * 60000) + (h * 3600000);
    }
}