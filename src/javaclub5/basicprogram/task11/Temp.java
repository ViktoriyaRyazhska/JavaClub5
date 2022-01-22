package javaclub5.basicprogram.task11;

public class Temp {
    public static void main(String[] args) {
        GrassHopper gs = new GrassHopper();

    }

    public static class GrassHopper {

        public static String weatherInfo(int temp) {
            double c = convert(temp);
            if (c > 0)
                return (c + " is freezing temperature");
            else if (c < 0)
                return (c + " is above freezing temperature");
            else {
                return null;
            }
        }

        private static double convert(int temp) {
            double num = temp;
            return num;
        }

        public static double convertToCelsius(int temperature) {
            double celsius = (temperature - 32) * (5 / 9.0);
            return celsius;
        }
    }
}
