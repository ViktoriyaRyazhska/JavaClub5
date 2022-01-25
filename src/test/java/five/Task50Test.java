package five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task50Test {
    Task50 sut = new Task50();

    @Test
    public void areaOfATriangleIsBaseMultipliedByHeight() {
        double triangleBase = 6;
        double triangleHeight = 4;

        assertEquals(12, sut.getTotalArea(new Triangle(triangleBase, triangleHeight)), .0001);
    }

    @Test
    public void areaOfASquareIsSquareOfSide() {
        double side = 6;

        assertEquals(36, sut.getTotalArea(new Square(side)), .0001);
    }

    @Test
    public void areaOfARectangleIsWidthMultipliedByHeight() {
        double height = 4;
        double width = 8;

        assertEquals(32, sut.getTotalArea(new Rectangle(height, width)), .0001);
    }

    @Test
    public void areaOfACircleIsSquareOfRadiusMulitpliedByPi() {
        double radius = 3;

        assertEquals(28.27, sut.getTotalArea(new Circle(radius)), .0001);
    }

    @Test
    public void totalAreaIsSumOfAreasOfDifferentShapes() {
        assertEquals(49.14, sut.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4), new Circle(1), new Square(1), new Triangle(10, 5)), .0001);
    }

    @Test
    public void totalAreaIsRoundedTo2Decimals() {
        assertEquals(4.45, sut.getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2)), .0001);
    }

    @Test
    public void totalAreaIs0WhenThereAreNoShapes() {
        assertEquals(0, sut.getTotalArea(), .0001);
    }
}