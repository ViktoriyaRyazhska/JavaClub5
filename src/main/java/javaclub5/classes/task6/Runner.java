package javaclub5.classes.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Return surface area and volume
 *
 * @author Mysakovych Maksym
 */


public class Runner {
    public static class Block{
        final int width;
        final int length;
        final int height;
        final int volume;
        final int surfaceArea;
        public Block(int[] array) {
            width = array[0];
            length = array[1];
            height = array[2];
            volume = width * length * height;
            surfaceArea = 2 * (width * length + width * height + length * height);
        }
        public int getWidth() {
            return width;
        }
        public int getLength() {
            return length;
        }
        public int getHeight() {
            return height;
        }
        public int getVolume() {
            return volume;
        }
        public int getSurfaceArea() {
            return surfaceArea;
        }
        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            start(br);
        }
        public static void start(BufferedReader br) {
            try {
            int[] array= new int[3];
            System.out.println("Enter width, length and height of the Block to have surface area and volume");
            System.out.println("Enter width: ");
            array[0] = Integer.parseInt(br.readLine());
            System.out.println("Enter length: ");
            array[1] = Integer.parseInt(br.readLine());
            System.out.println("Enter height: ");
            array[2] = Integer.parseInt(br.readLine());
                Block b = new Block(array);
                System.out.println("Width = "+b.getWidth());
                System.out.println("Length = "+b.getLength());
                System.out.println("Height = "+b.getHeight());
                System.out.println("Volume = "+b.getVolume());
                System.out.println("Surface Area = "+b.getSurfaceArea());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}




