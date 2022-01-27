package javaclub5.string.task62;

import java.util.Scanner;

public class Task62 {

    public static void start(Scanner scanner) {
        System.out.println("Enter degree of temperature: ");
        try {
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println(weatherInfo(a));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static int convertToCelsius(int temperature) {
        int celsius = (int) ((temperature - 32) * (5 / 9.0));
        return celsius;
    }
}
