package javaclub5.loops.task38;

import java.util.Scanner;

public class Task38 {
    public static boolean average(float yourPoint,float [] classPoint){
        float total = 0;
        for(int i=0; i<classPoint.length; i++){
            total = total + classPoint[i];
        }
        float average = total / classPoint.length;
        System.out.format("The average mark of your class is: %.2f", average);
        if(yourPoint>average){
            System.out.println("\n");
            return true;
        }else
            System.out.println("\n");
            return false;
    }

    public static void main(Scanner scanner) {
        try {
            System.out.println("Enter your average mark: ");
            float yourPoint = scanner.nextFloat();
            System.out.println("Enter number of student in your class: ");
            int n = scanner.nextInt();

            float[] classPoint = new float[n];
            for (int i = 0; i < classPoint.length; i++) {
                System.out.print("Enter mark of student №." + (i + 1) + ": ");
                classPoint[i] = scanner.nextFloat();
            }
            System.out.println(average(yourPoint,classPoint));
        }catch (Exception e) {

            System.out.println("Put correct number");

        }

    }
}
