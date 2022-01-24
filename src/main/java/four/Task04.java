package four;

import java.io.BufferedReader;

public class Task04 {
    public static boolean isDivisible(int wallLength, int pixelSize) {
       double b=wallLength % pixelSize;
       if(b!=0){
        return   false;
       }
        return true;
}
    public static void task04(BufferedReader reader) {
        System.out.println("Your function should take two arguments: the size of the wall in millimeters and the size of a pixel in millimeters. ");
        try {
            System.out.println("Set parameter a wall  in pixels:");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Set parameter dnumber of pixels of a certain length:");
            int x = Integer.parseInt(reader.readLine());


            System.out.println("Answer:  is--> "+ isDivisible(n,x));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
