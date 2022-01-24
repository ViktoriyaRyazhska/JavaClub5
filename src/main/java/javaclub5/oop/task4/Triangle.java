package javaclub5.oop.task4;

/**
 * Triangle class
 *
 * @author Rostyslav Ros
 */
public class Triangle extends Figure{
    double triangleBase;
    double triangleHeight;


    /**
     * constructor Triangle with two parameters
     * @param triangleBase - size of base of triangle
     * @param triangleHeight - size of height of triangle
     */
    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    /**
     * method for calculation area of triangle
     *
     */
    public double calculateArea() {
        double result = (triangleBase * triangleHeight)/2;
        result = Math.ceil(result * 100) / 100;
        return result;
    }
}
