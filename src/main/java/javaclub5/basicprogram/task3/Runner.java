package javaclub5.basicprogram.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Bob needs a fast way to calculate the volume of a cuboid
 * with three values: length, width and the height of the cuboid.
 * Write a function to help Bob with this calculation. *
 *
 * @author Rostyslav Ros
 */


public class Runner {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }

    /**
     * calculate the volume of a cuboid with three values:
     * @param length - length of cuboid,
     * @param width - width of cuboid,
     * @param height - height of cuboid,
     * @return volume of cuboid
     */
    public static double calculateVolumeOfCuboid(double length, double width, double height) {
        double volume = length * width * height;
        return volume;
    }

    /**
     * main method of Class
     *
     */
    public static void start(BufferedReader reader) {
        System.out.println("help Bob to calculate the volume of a cuboid");
        try {
            System.out.println("Input length");
            double length = Double.parseDouble(reader.readLine());
            System.out.println("Input width");
            double width = Double.parseDouble(reader.readLine());
            System.out.println("Input height");
            double height = Double.parseDouble(reader.readLine());
            double volume = calculateVolumeOfCuboid(length, width, height);
            System.out.printf("Volume of cuboid wil be %.2f", volume);
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }
}
