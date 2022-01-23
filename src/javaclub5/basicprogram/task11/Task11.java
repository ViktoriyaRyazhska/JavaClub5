package javaclub5.basicprogram.task11;

import java.util.Scanner;

public class Task11 {
    public static void start(Scanner scanner){
        try {
            int x;
            System.out.println("To convert, wright temperature in (°F):");
            System.out.println(x = convertToCelsius(scanner.nextInt()));
            System.out.println(weatherInfo(x));
        }catch (Exception e){

        }
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
    }