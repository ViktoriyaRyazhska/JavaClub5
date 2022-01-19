package javaclub5.basicprogram.task3;
/**
 * Bob needs a fast way to calculate the volume of a cuboid
 * with three values: length, width and the height of the cuboid.
 * Write a function to help Bob with this calculation. *
 *
 * @author Rostyslav Ros
 */


public class Runner {
    public static void main(String[] args) {

    }

    /**
     * calculate the volume of a cuboid with three values:
     * @param length - length of cuboid,
     * @param width - width of cuboid,
     * @param height - height of cuboid,
     * @return volume of cuboid
     */
    public double calculateVolumeOfCuboid(double length, double width, double height) {
        double volume = length * width * height;
        return volume;
    }
}
