package javaclub5.oop.task4;

/**
 * Circle class
 *
 * @author Rostyslav Ros
 */
public class Circle extends Figure{
    double radius;

    /**
     * constructor Circle with one parameter
     * @param radius - size of base of triangle     *
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * method for calculation area of circle
     *
     */
    public double calculateArea() {


        return 3.14 * radius * radius;
    }
}
