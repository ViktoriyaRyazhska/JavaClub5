package javaclub5.basicprogram.task3;


import java.util.Scanner;

public class Task3 {
    /*
      Bob needs a fast way to calculate the volume of a cuboid with three values:
      length, width and the height of the cuboid.
      Write a function to help Bob with this calculation.
     */


    public static float CubeVolume(float high, float length, float width){
        float V = high*length*width;
        System.out.println("Volume = " + V);
        return V;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter high, length and width of your cuboid: ");

            try {
                float high = scanner.nextFloat();
                float length = scanner.nextFloat();
                float  width = scanner.nextFloat();
                if(high>0 && length>0 && width>0) {
                    System.out.println("High = " + high);
                    System.out.println("Length = " + length);
                    System.out.println("Width = " + width);
                    CubeVolume(high, length, width);
                }else
                    System.out.println("Input only positive numbers");

            } catch (Exception e) {

                System.out.println("Put correct number");

            }

        }
    }

