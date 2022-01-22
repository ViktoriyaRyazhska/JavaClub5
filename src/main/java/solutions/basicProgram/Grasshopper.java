package solutions.basicProgram;

import solutions.Executable;

import java.util.Scanner;

public class Grasshopper implements Executable {
    String weatherInfo (double temp) {
        var c = convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    double convertToCelsius (double temperature) {
        return (temperature - 32.0) * (5.0/9.0);

    }

    @Override
    public void execute() {
        System.out.println("Enter degree in Fahrenheit");
        var temp = new Scanner(System.in).nextDouble();
        System.out.println(weatherInfo(temp));
    }
}
