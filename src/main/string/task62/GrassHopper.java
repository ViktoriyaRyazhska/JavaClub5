package main.string.task62;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;

import java.util.Scanner;
public class GrassHopper implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static String weatherInfo /*🌡️ℹ️*/(double temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9.0;
    }

    @Override
    public void execute() {
        System.out.println("Implement a function which convert fahrenheit to celsius.");
        System.out.println("You must enter degrees Fahrenheit. ");
        System.out.println("Lets enter  degrees: ");
        try {
            int degrees = scan.nextInt();
            System.out.println(GrassHopper.weatherInfo(degrees));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}
