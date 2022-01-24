package solutions.basicProgram;

import program.helper.Helper;
import solutions.Executable;

public class Grasshopper implements Executable {
    String weatherInfo(double temp) {
        var c = convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    double convertToCelsius(double temperature) {
        return (temperature - 32.0) * (5.0 / 9.0);
    }

    @Override
    public void execute() {
        System.out.println("Enter degree in Fahrenheit");
        System.out.println(weatherInfo(Helper.getDouble(1000.0)));
    }
}
