package javaclub5.oop.task4;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class CalculatorTest {

    @Test
    public void getAreaTriangleTest() {
        double triangleBase = 8;
        double triangleHeight = 4;

        Assert.assertEquals(16, Calculator.getTotalArea(new Triangle(triangleBase, triangleHeight)), .01);
    }

    @Test
    public void getAreaCircleTest() {
        double radius = 5;

        Assert.assertEquals(78.5, Calculator.getTotalArea(new Circle(radius)), .01);
    }

    @Test
    public void getAreaRectangleTest() {
        double height = 5;
        double width = 7;

        Assert.assertEquals(35, Calculator.getTotalArea(new Rectangle(height, width)), .01);
    }

    @Test
    public void getAreaSquareTest() {
        double side = 6;

        Assert.assertEquals(36, Calculator.getTotalArea(new Square(side)), .01);
    }

}