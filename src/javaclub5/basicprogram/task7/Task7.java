package javaclub5.basicprogram.task7;

import java.util.Scanner;

public class Task7 {

    /*Clock shows h hours, m minutes and s seconds after midnight.
    Your task is to write a function which returns the time since midnight in milliseconds.*/

    public static int start(Scanner scanner) {
        try {
            System.out.println("Enter hour ");
            int hour = scanner.nextInt();
            System.out.println("Enter minutes ");
            int minutes = scanner.nextInt();
            System.out.println("Enter seconds ");
            int seconds = scanner.nextInt();
            System.out.println("Your result is " + clock(hour,minutes,seconds));
        } catch (Exception a) {
            System.out.println("Write another number ");
        }
        return 0;
    }

    public static int clock(int h, int m, int s) {
        int hm = 3600000;
        int mm = 60000;
        int sm = 1000;
        h = h * hm;
        m = m * mm;
        s = s * sm;
        return h + m + s;
    }
}