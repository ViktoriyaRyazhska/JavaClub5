package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task31 {
    public static int rentalCarCost(int d) {
        if(d >= 7)
            return d * 40 - 50;
        else if (d >= 3)
            return d * 40 - 20;
        return d * 40;
    }

    public static void task31(BufferedReader reader) {
        System.out.println("The task is to count how much it will cost to rent a car.");
        try {
            System.out.println("Set parameter:");
            int days = Integer.parseInt(reader.readLine());
            System.out.println("Answer: " + rentalCarCost(days));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
