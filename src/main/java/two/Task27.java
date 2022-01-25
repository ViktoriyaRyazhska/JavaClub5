package two;

import java.io.BufferedReader;
import java.io.IOException;

public class Task27 {
    public static String EnoughSpace(int cap, int on, int wait) {
        int left = cap - on;
        String put = Integer.toString(left);
        String waitAll = Integer.toString(wait);
        return (wait == cap - on || wait < cap - on) ? "He can fit all " + waitAll + " passengers" :
                "He can fit " + put + " of the " + waitAll + " waiting";
    }

    public static void task27(BufferedReader reader) {
        System.out.println("Will there be enough space");
        try {
            System.out.println("Enter the amount of people the bus can hold excluding the driver.");
            int cap = Integer.parseInt(reader.readLine());
            System.out.println("Enter the amount of people the bus can hold excluding the driver.");
            int on = Integer.parseInt(reader.readLine());
            System.out.println("Enter the number of people waiting to get on to the bus excluding the driver.");
            int wait = Integer.parseInt(reader.readLine());
            System.out.println(EnoughSpace(cap, on, wait));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
