package javaclub5.basicprogram.task4;

import java.util.Scanner;

public class Task4 {
    /*
    You're laying out a rad pixel art mural to paint on your living room wall in homage to Paul Robertson,
     your favorite pixel artist.

    You want your work to be perfect down to the millimeter.
    You haven't decided on the dimensions of your piece, how large you want your pixels to be, or which wall
    you want to use. You just know that you want to fit an exact number of pixels.

    To help decide those things you've decided to write a function, is_divisible() that will tell you whether
    a wall of a certain length can exactly fit an integer number of pixels of a certain length.

    Your function should take two arguments: the size of the wall in millimeters and the size of a pixel in millimeters.
    It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False.
    For example is_divisible(4050, 27) should return True, but is_divisible(4066, 27) should return False.
     */
        public static boolean isDivisible(int wallLength, int pixelSize) {

            return wallLength % pixelSize == 0 && wallLength > 0 && pixelSize > 0;
        }

    public static void main(Scanner scanner) {
            try{
        System.out.println("Enter size of wall: ");
        int wallLength = scanner.nextInt();
        System.out.println("Enter size of pixel: ");
        int pixelSize = scanner.nextInt();
        System.out.println(isDivisible(wallLength,pixelSize));

            } catch (Exception e) {
                System.out.println("Put correct number");
            }
    }
    }

