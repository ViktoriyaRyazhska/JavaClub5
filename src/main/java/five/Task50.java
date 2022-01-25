package five;

import java.io.BufferedReader;
import java.io.IOException;

public class Task50 {
    public static void task50(BufferedReader reader) {
        int in;
        System.out.println("Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`");
        try {
            System.out.println("Choose a figure to calculate the area : 1 - Square, 2 - Rectangle, 3 - Circle, 4 - Triangle; ");
            in = Integer.parseInt(reader.readLine());
            switch (in) {
                case 1 -> {
                    System.out.println("You choose Square");
                    System.out.println("Enter side");
                    double side = Double.parseDouble(reader.readLine());
                    Task50 task50 = new Task50();
                    double result = task50.getTotalArea(new Square(side));
                    System.out.println("Your square : " + result);
                }
                case 2 -> {
                    System.out.println("You choose Rectangle");
                    System.out.println("Enter width");
                    double width = Double.parseDouble(reader.readLine());
                    System.out.println("Enter height");
                    double height = Double.parseDouble(reader.readLine());
                    Task50 task50 = new Task50();
                    double result = task50.getTotalArea(new Rectangle(height, width));
                    System.out.println("Your square : " + result);
                }
                case 3 -> {
                    System.out.println("You choose Circle");
                    System.out.println("Enter radius");
                    double radius = Double.parseDouble(reader.readLine());
                    Task50 task50 = new Task50();
                    double result = task50.getTotalArea(new Circle(radius));
                    System.out.println("Your square : " + result);
                }
                case 4 -> {
                    System.out.println("You choose Triangle");
                    System.out.println("Enter triangleBase");
                    double triangleBase = Double.parseDouble(reader.readLine());
                    System.out.println("Enter triangleHeight");
                    double triangleHeight = Double.parseDouble(reader.readLine());
                    Task50 task50 = new Task50();
                    double result = task50.getTotalArea(new Triangle(triangleBase, triangleHeight));
                    System.out.println("Your square : " + result);
                }
                default -> System.out.println("Incorrect number");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }

    double getTotalArea(Shape... figures) {
        double sum = 0;
        for (Shape f : figures) {
            sum += f.getTotalArea();
        }

        return roundDouble(sum);
    }

    public double roundDouble(double d) {
        d = d * 100;
        int i = (int) Math.round(d);
        return (double) i / 100;
    }
}

class Triangle implements Shape {
    double triangleBase;
    double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double getTotalArea() {
        return this.triangleBase * this.triangleHeight / 2;
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getTotalArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Rectangle implements Shape {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getTotalArea() {
        return this.height * this.width;
    }
}

class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getTotalArea() {
        return this.side * this.side;
    }
}

interface Shape {
    double getTotalArea();
}
