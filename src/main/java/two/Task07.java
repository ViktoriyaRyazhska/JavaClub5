package two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task07 {
    public static long passMilliseconds(int hours, int minutes, int sec) {
        if(hours < 0 || minutes < 0 || sec < 0)
            return 0;
        return (sec * 1000) + (minutes * 60000) + (hours * 3600000);
    }

    public static void task07(BufferedReader reader){
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("hh:mm:ss");
        System.out.println("Is writing a function which returns the time since midnight in milliseconds.");
        BufferedReader times = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter hours");
            String h = times.readLine();

            System.out.println("Enter minutes");
            String m = times.readLine();

            System.out.println("Enter seconds");
            String s = times.readLine();

            int hours =  Integer.parseInt(h);
            int minutes = Integer.parseInt(m);
            int sec = Integer.parseInt(s);


            System.out.println("Milliseconds after midnight  " + passMilliseconds(hours, minutes, sec));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
