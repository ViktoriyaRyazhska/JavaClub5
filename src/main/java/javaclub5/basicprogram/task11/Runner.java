package javaclub5.basicprogram.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Grasshopper - Debug
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }
    public static String weatherInfo(int temp) {
        if (temp > 0)
            return (temp + " is freezing temperature");
        else if (temp < 0)
            return (temp + " is above freezing temperature");
        else {
            return null;
        }
    }
    public static int convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * (5 / 9.0);
        return (int) celsius;
    }
            public static void start(BufferedReader br) {
                try {
                    int x;
                    System.out.println("To convert, wright temperature in (°F): ");
                    System.out.println(x = convertToCelsius(br.read()));
                    System.out.println(weatherInfo(x));
                } catch (IOException e) {
                    System.out.println("Wrong input");
                    e.printStackTrace();
                }
            }
}
