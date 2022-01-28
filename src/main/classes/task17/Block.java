package main.classes.task17;

import main.InterfaceTestClass;

import java.util.Scanner;
public class Block implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);
    private int width;

    private int length;

    private int height;

    public Block() {

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

    public Block(int[] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + width * height + length * height);
    }

    @Override
    public void execute() {
        Block b = new Block(new int[]{2, 2, 2});
        System.out.println("Implement a class 'Block' that creates a block.");
        System.out.println("You must enter width, length, height.");
        System.out.println("Lets enter width: ");
        try {
            int width = scan.nextInt();
            System.out.println("Lets enter length: ");
            int length = scan.nextInt();
            System.out.println("Lets enter height: ");
            int height = scan.nextInt();
            System.out.println("Created a `Block` object with a width of " + width + " a length of " + length + " and a height of " + height + ".");
        } catch (Exception e) {
            System.out.println("Please check your input.");
        }
    }
}