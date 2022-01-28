package javaclub5.OOP.task50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Task50Test {
    @Test
    void areaOfTriangle(){
        float triangleHigh = 6;
        float triangleSide = 4;
        Assertions.assertAll(()-> assertEquals(12,Task50.getTotalArea(new Triangle(triangleHigh,triangleSide))));
    }
    @Test
    void areaOfCircle(){
        float radius = 3;
        Assertions.assertAll(()->assertEquals(28.27f,Task50.getTotalArea(new Circle(radius)),0.2f));
    }
    @Test
    void areaOfSquare(){
        float side = 5;
        Assertions.assertAll(()-> assertEquals(25,Task50.getTotalArea(new Square(side))));
    }
    @Test
    void areaOfRectangle(){
        float high = 4;
        float length = 8;
        Assertions.assertAll(()->assertEquals(32,Task50.getTotalArea(new Rectangle(high,length))));
    }
}