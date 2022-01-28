package javaclub5.OOP.task50;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task50Test {
    @Test
    public void areaOfATriangleIsBaseMultipliedByHeight()
    {
        double triangleBase = 6;
        double triangleHeight = 4;

        assertEquals(12, Task50.getTotalArea(new Triangle(triangleBase, triangleHeight)), .0001);
    }

    @Test
    public void areaOfASquareIsSquareOfSide()
    {
        double side = 6;

        assertEquals(36, Task50.getTotalArea(new Square(side)), .0001);
    }

    @Test
    public void areaOfARectangleIsWidthMultipliedByHeight()
    {
        double height = 4;
        double width = 8;

        assertEquals(32, Task50.getTotalArea(new Rectangle(height, width)), .0001);
    }

    @Test
    public void areaOfACircleIsSquareOfRadiusMulitpliedByPi()
    {
        double radius = 3;

        assertEquals(28.27, Task50.getTotalArea(new Circle(radius)), .0001);
    }

    @Test
    public void totalAreaIsSumOfAreasOfDifferentShapes()
    {
        assertEquals(49.14, Task50.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4), new Circle(1), new Square(1), new Triangle(10, 5)), .0001);
    }

    @Test
    public void totalAreaIsRoundedTo2Decimals()
    {
        assertEquals(4.45, Task50.getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2)), .0001);
    }

    @Test
    public void totalAreaIs0WhenThereAreNoShapes()
    {
        assertEquals(0, Task50.getTotalArea(), .0001);
    }

}