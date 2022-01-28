package javaclub5.basicprogram.task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Clock shows h hours, m minutes and s seconds after midnight.
 *
 * Your task is to write a function which returns the time since midnight in milliseconds.
 * @author Dmytro Prudius
 */
public class Runner{

    public static void start(BufferedReader br) {
        System.out.println("You need to keep data that returns time from midnight in milliseconds. ");
        try {
            System.out.println("Enter hour: ");
            int hour = Integer.parseInt(br.readLine());
            System.out.println("Enter minutes: ");
            int minutes = Integer.parseInt(br.readLine());
            System.out.println("Enter seconds: ");
            int seconds = Integer.parseInt(br.readLine());
            System.out.println("Result: " + past(hour,minutes,seconds));
        }catch (Exception e){
            System.out.println("Wrong input");
        }

    }

    public static int past(int h, int m, int s) {
        int convertHours = h * 60 * 60 * 1000;
        int convertMinutes = m * 60 * 1000;
        int convertSeconds = s * 1000;
        return convertHours + convertMinutes + convertSeconds;
    }
}


