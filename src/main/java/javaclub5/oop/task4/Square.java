package javaclub5.oop.task4;

/**
 * Triangle class
 *
 * @author Rostyslav Ros
 */
public class Square extends Figure{
    double side;

    /**
     * constructor Square with one parameter
     * @param side - side of square
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * method for calculation area of square
     */
    public double calculateArea() {
        return side * side;
    }
}
