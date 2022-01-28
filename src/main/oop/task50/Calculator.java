package main.oop.task50;

import main.InterfaceTestClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public double getTotalArea(Figure... figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.gretArea();
        }
        return roundDouble(sum);
    }
    public double roundDouble(double d) {
        d = d * 100;
        int i = (int) Math.round(d);
        return (double) i/100;
    }

    @Override
    public void execute() {
        int figure = 0;
        System.out.println("Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`");
        System.out.println("Let's calculate area.");
        System.out.println("Which figure you will choose: \n 1) Circle \n 2) Rectangle \n 3) Square \n 4) Triangle");
        try {
            figure = scanner.nextInt();
            if (figure > 4) throw new NumberFormatException();
            switch (figure) {
                case 1 -> {
                    System.out.println("Please specify -> Radius");
                    double radius = scanner.nextDouble();
                    System.out.println(getTotalArea(new Circle(radius)));
                }
                case 2 -> {
                    System.out.println("Please specify -> Height");
                    double height = scanner.nextDouble();
                    System.out.println("Please specify -> Width");
                    double width = scanner.nextDouble();
                    System.out.println(getTotalArea(new Rectangle(height, width)));
                }
                case 3 -> {
                    System.out.println("Please specify -> Square Side");
                    double squareSide = scanner.nextDouble();
                    System.out.println(getTotalArea(new Square(squareSide)));
                }
                case 4 -> {
                    System.out.println("Please specify -> Triangle Base");
                    double triangleBase = scanner.nextDouble();
                    System.out.println("Please specify -> Triangle Height");
                    double triangleHeight = scanner.nextDouble();
                    System.out.println(getTotalArea(new Triangle(triangleBase, triangleHeight)));
                }

            }
        }catch (InputMismatchException | NumberFormatException exception){
            System.out.println("Wrong input");
        }

    }
}


