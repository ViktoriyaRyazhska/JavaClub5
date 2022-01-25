package three;
import java.io.BufferedReader;

public class Task03 {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    public static void task03(BufferedReader reader) {
        System.out.println("The task is to calculate the volume of a cuboid with three values: length, width and the height of the cuboid..");
        try {
            System.out.println("Set parameters separated by \"Enter\" key:");
            double length = Double.parseDouble(reader.readLine());
            double width = Double.parseDouble(reader.readLine());
            double height = Double.parseDouble(reader.readLine());
            System.out.println("The cubes volume is: " + getVolumeOfCuboid(length, width, height));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }



}