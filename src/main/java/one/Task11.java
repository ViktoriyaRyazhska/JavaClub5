package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task11 {
    public static String weatherInfo(int temp) {
        double tempInCelsius = (temp - 32) * 5/9.0;
        if (tempInCelsius < 0)
            return (tempInCelsius + " is freezing temperature");
        else
            return (tempInCelsius + " is above freezing temperature");
    }

    public static void task11() {
        System.out.println("The task is to convert fahrenheit to celsius.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Set parameter:");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("Answer: ");
            System.out.println(weatherInfo(i));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
