package javaclub5.classes.task17;

import java.util.Scanner;

public class Task17 {
public static class Block{
private int width;
private int height;
private int length;

   public Block(int[] params) {
       width = params[0];
       length = params[1];
       height = params[2];
    }

    public int getWidth() {return width;}

    public int getHeight() {return height;}

    public int getLength() {return length;}
    public int getVolume() {return width*height*length;}
    public int getSurfaceArea() {return 2*width*length+2*length*height+2*height*width;}

}

    public static void main(Scanner sc) {
        int array[]= new int[3];
        System.out.println("Enter parameters:");
        try {

            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
                if(array[i]<0){
                    System.out.println("Wrong input");
                    System.exit(1);
                }
            }
        }
        catch (Exception e){
            System.out.println("Wrong input");
            System.exit(1);
        }
        Block b = new Block(array);
        System.out.println("Width="+b.getWidth());

        System.out.println("Length="+b.getLength());

        System.out.println("Height="+b.getHeight());

        System.out.println("Volume="+b.getVolume());

        System.out.println("Surface Area="+b.getSurfaceArea());
}
}
