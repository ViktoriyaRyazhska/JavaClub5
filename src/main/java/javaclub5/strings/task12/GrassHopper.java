package javaclub5.strings.task12;



public class GrassHopper {
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * (5/9.0);
    }

}
