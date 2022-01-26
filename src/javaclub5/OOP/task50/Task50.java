package javaclub5.OOP.task50;

import java.util.Scanner;

public class Task50 {
    public static double getTotalArea(Figure... figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getArea();
        }
        return sum;
    }

    public static void main(Scanner scanner) {
        System.out.println("Enter a figure you want to calculate area");
        System.out.println("Rectangle --> 1, Circle --> 2, Triangle --> 3, Square --> 4 : ");
        int m = scanner.nextInt();
        switch (m){
            case 1:
                System.out.println("Enter high: ");
                float high = scanner.nextFloat();
                System.out.println("Enter length: ");
                float length = scanner.nextFloat();
                System.out.print("Your area equals: ");
                System.out.printf("%.2f",getTotalArea(new Rectangle(high,length)));
                break;
            case 2:
                System.out.println("Enter radius: ");
                float radius = scanner.nextFloat();
                System.out.print("Your area equals: ");
                System.out.printf("%.2f", getTotalArea(new Circle(radius)));
                break;
            case 3:
                System.out.println("Enter high: ");
                float triangleHigh = scanner.nextFloat();
                System.out.println("Enter side: ");
                float triangleSide = scanner.nextFloat();
                System.out.print("Your area equals: ");
                System.out.printf("%.2f",getTotalArea(new Triangle(triangleHigh,triangleSide)));
                break;
            case 4:
                System.out.println("Enter side: ");
                float side = scanner.nextFloat();
                System.out.print("Your area equals: ");
                System.out.printf("%.2f", getTotalArea(new Square(side)));
                break;
        }
    }
}


