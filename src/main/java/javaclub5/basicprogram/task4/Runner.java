package javaclub5.basicprogram.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 You're laying out a rad pixel art mural to paint on your living room wall in homage to Paul Robertson,
 our favorite pixel artist.
 You want your work to be perfect down to the millimeter. You haven't decided on the dimensions of your piece,
 how large you want your pixels to be, or which wall you want to use. You just know that you want to fit
 an exact number of pixels.
 To help decide those things you've decided to write a function, is_divisible() that will tell you whether a wall
 of a certain length can exactly fit an integer number of pixels of a certain length.
 Your function should take two arguments: the size of the wall in millimeters and the size of a pixel in millimeters.
 It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False.
 For example is_divisible(4050, 27) should return True, but is_divisible(4066, 27) should return False.
 *
 * @author Rostyslav Ros
 */

public class Runner {
    public static void main(String[] args) {
        start();
    }
    /**
     * calculate the volume of a cuboid with three values:
     * @param wallSize - size of the wall in millimeters,
     * @param pixelSize - size of a pixel in millimeters,
     * @return if you can fit an exact number of pixels on the wall
     */
    public static boolean is_divisible(int wallSize, int pixelSize) {
        return wallSize % pixelSize == 0;
    }

    /**
     * main method of Class
     *
     */
    public static void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input parameters of a rad pixel art mural");
        try {
            System.out.println("Input wallSize");
            int wallSize = Integer.parseInt(reader.readLine());
            System.out.println("Input pixelSize");
            int pixelSize = Integer.parseInt(reader.readLine());
            System.out.println(is_divisible(wallSize, pixelSize));
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

}
