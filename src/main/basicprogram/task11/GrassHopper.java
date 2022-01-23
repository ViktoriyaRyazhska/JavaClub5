package main.basicprogram.task11;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.util.Locale;
import java.util.Scanner;

public class GrassHopper implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String weatherInfo(int temp) {
        double c = convert(temp);
        String formattedDouble = String.format(Locale.US, "%.1f", c);
        if (c < 0)
            return (formattedDouble + " is freezing temperature");
        else
            return (formattedDouble + " is above freezing temperature");
    }

    public static double convert(int temperature) {
        double celsius = (temperature - 32) * (5/9.0);
        return celsius;
    }

    @Override
    public void execute() {
        System.out.println("Find the errors in the code to get the celsius converter working properly.\n" + "To convert fahrenheit to celsius:");
        System.out.println("Enter temperature in fahrenheit: ");
        System.out.println(GrassHopper.weatherInfo(scanner.nextInt()));
    }
}