package javaclub5.OOP.task50;

public class Triangle extends Figure{
public Triangle(float triangleHigh,float triangleSide){
    super.triangleHigh = triangleHigh;
    super.triangleSide = triangleSide;
}

    @Override
    public float getArea() {
        return (triangleHigh*triangleSide)/2;
    }
}
