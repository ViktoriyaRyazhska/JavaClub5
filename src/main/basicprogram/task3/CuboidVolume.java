package main.basicprogram.task3;

import main.InterfaceTestClass;
import java.util.Scanner;

public class CuboidVolume implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static double getVolumeOfCuboid(double length, double width, double height) {
        if (length < 0 || width < 0 || height < 0) {
            System.out.println("Parameters can't be negative");
            System.exit(0);
        }
        return length * width * height;
    }

    @Override
    public void execute() {
        double length, width, height;
        System.out.println("Bob needs a fast way to calculate the volume of a cuboid " +
                "with three values: length, width and the height of the cuboid. ");
        System.out.println("Please enter the length of cuboid: ");
        length = scanner.nextDouble();
        System.out.println("Please enter the width of cuboid: ");
        width = scanner.nextDouble();
        System.out.println("Please enter the height of cuboid: ");
        height = scanner.nextDouble();
        System.out.println("Volume of cuboid is " + CuboidVolume.getVolumeOfCuboid(length,width,height));
    }
}
