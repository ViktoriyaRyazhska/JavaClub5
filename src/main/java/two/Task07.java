package two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task07 {
    public static long passMilliseconds(int hours, int minutes, int sec){
        Calendar c=Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 00);
        c.set(Calendar.MINUTE, 00);
        c.set(Calendar.SECOND,00);

        Date d1=c.getTime();

        Calendar c1 =Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, hours);
        c.set(Calendar.MINUTE, minutes);
        c.set(Calendar.SECOND, sec);

        Date d=c1.getTime();
        long dt=d.getTime()-d1.getTime();
        return dt;
    }

    public static void task07(){
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
