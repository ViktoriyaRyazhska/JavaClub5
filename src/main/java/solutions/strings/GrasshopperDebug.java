package solutions.strings;

import solutions.Executable;

import java.util.Scanner;

public class GrasshopperDebug implements Executable {

    int temp;
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return ((temperature - 32) * (5/9.0));
    }

    public void getData()
    {
        System.out.println("Enter temp in fahrenheit: ");
        this.temp = new Scanner(System.in).nextInt();
    }



    @Override
    public void execute() {
        getData();
        System.out.println(weatherInfo(this.temp));
    }
}
