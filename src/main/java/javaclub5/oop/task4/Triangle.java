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
        return (triangleBase * triangleHeight)/2;
    }
}
