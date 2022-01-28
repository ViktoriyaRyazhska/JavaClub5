package main.basicprogram.task3;

import main.InterfaceTestClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CuboidVolume implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public void execute() {
        double length, width, height;
        System.out.println("Bob needs a fast way to calculate the volume of a cuboid " +
                "with three values: length, width and the height of the cuboid. ");
        System.out.println("Please enter the length of cuboid: ");
        try {
            length = scanner.nextDouble();
            if (length <= 0) {
                System.out.println("Length can't be negatives and equals 0!");
                System.out.println("Try to enter again:");
                length = scanner.nextDouble();
            }
            System.out.println("Please enter the width of cuboid: ");
            width = scanner.nextDouble();
            if (width <= 0) {
                System.out.println("Width can't be negatives and equals 0!");
                System.out.println("Try to enter again:");
                width = scanner.nextDouble();
            }
            System.out.println("Please enter the height of cuboid: ");
            height = scanner.nextDouble();
            if (height <= 0) {
                System.out.println("Height can't be negatives and equals 0!");
                System.out.println("Try to enter again:");
                height = scanner.nextDouble();
            }
            System.out.println("Volume of cuboid is " + CuboidVolume.getVolumeOfCuboid(length, width, height));
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Wrong input!");
        }
    }
}
