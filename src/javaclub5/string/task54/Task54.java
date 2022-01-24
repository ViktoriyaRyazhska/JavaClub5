package javaclub5.string.task54;

import java.util.Scanner;

public class Task54 {
    public static int opposite(int a){
        return -a;
    }
    public static float opposite(float b){
        return -b;
    }

    public static void main(Scanner scanner) {
        System.out.print("Press 1 for integer numbers or 2 for float numbers: ");
        try {
        int m = scanner.nextInt();

            switch (m) {
                case 1:
                    System.out.println("Enter int number: ");
                    int a = scanner.nextInt();
                    System.out.print("Opposite: " + opposite(a));
                    break;
                case 2:
                    System.out.println("Enter float number: ");
                    float b = scanner.nextFloat();
                    System.out.print("Opposite: " + opposite(b));
                    break;
            }
        }catch (Exception e) {

        System.out.println("Put correct number");

    }
    }
}
