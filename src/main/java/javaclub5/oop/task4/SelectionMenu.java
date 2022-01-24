package javaclub5.oop.task4;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Class for selection of the figure that we want to calculate area
 *
 * @author Rostyslav Ros
 */
public class SelectionMenu {
    /**
     * Method for selection and creation Figure
     * @param reader
     * @return Figure Object
     */
    public static Figure selectFigure(BufferedReader reader) {
        System.out.println("Select figure: \n 1. Circle \n 2. Rectangle\n 3. Square\n 4. Triangle \n 0. Exit");
        try {
            int result = Integer.parseInt(reader.readLine());
            switch (result) {
                case 1: return circleCreation(reader);
                case 2: return rectangleCreation(reader);
                case 3: return squareCreation(reader);
                case 4: return triangleCreation(reader);
            }

        } catch (Exception e) {
            System.out.println("Wrong input");
            selectFigure(reader);
        }
        return null;
    }

    /**
     * Method for creation Circle
     * @param reader
     * @return Circle Object
     */
    public static Figure circleCreation(BufferedReader reader) {
        System.out.println("Input radius");
        try {
            double radius = Double.parseDouble(reader.readLine());
            Figure circle = new Circle(radius);
            return circle;
        } catch (IOException e) {
            System.out.println("Wrong input");
            circleCreation(reader);
        }
        return null;
    }

    /**
     * Method for creation Rectangle
     * @param reader
     * @return Rectangle Object
     */
    public static Figure rectangleCreation(BufferedReader reader) {
        System.out.println("Input height");
        try {
            double height = Double.parseDouble(reader.readLine());
            System.out.println("Input width");
            double width = Double.parseDouble(reader.readLine());
            Figure rectangle = new Rectangle(height, width);
            return rectangle;
        } catch (IOException e) {
            System.out.println("Wrong input");
            rectangleCreation(reader);
        }
        return null;
    }

    /**
     * Method for creation Triangle
     * @param reader
     * @return Triangle Object
     */
    public static Figure triangleCreation(BufferedReader reader) {
        System.out.println("Input size of base of triangle");
        try {
            double triangleBase = Double.parseDouble(reader.readLine());
            System.out.println("Input size of height of triangle");
            double triangleHeight = Double.parseDouble(reader.readLine());
            Figure triangle = new Triangle(triangleBase, triangleHeight);
            return triangle;
        } catch (IOException e) {
            System.out.println("Wrong input");
            triangleCreation(reader);
        }
        return null;
    }

    /**
     * Method for creation Square
     * @param reader
     * @return Square Object
     */
    public static Figure squareCreation(BufferedReader reader) {
        System.out.println("Input side of square");
        try {
            double side = Double.parseDouble(reader.readLine());
            Figure square = new Square(side);
            return square;
        } catch (IOException e) {
            System.out.println("Wrong input");
            circleCreation(reader);
        }
        return null;
    }
}

