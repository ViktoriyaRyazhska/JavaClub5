package javaclub5.oop.task4;

/**
 * Rectangle class
 *
 * @author Rostyslav Ros
 */
public class Rectangle extends Figure{
    double height;
    double width;


    /**
     * constructor Rectangle with two parameters
     * @param height - size of base of triangle
     * @param width - size of height of triangle
     */
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * method for calculation area of rectangle
     */
    public double calculateArea() {
        return height * width;
    }
}
