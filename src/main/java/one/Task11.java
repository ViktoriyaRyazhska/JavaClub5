package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task11 {
    public static String weatherInfo(int temp) {
        double tempInCelsius = (temp - 32) * 5/9.0;
        double res = Math.round(tempInCelsius);

        if (res < 0)
            return (res + " is freezing temperature");
        else
            return (res + " is above freezing temperature");
    }

    public static void task11(BufferedReader reader) {
        System.out.println("The task is to convert fahrenheit to celsius.");
        try {
            System.out.println("Set parameter:");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("Answer: ");
            System.out.println(weatherInfo(i));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
