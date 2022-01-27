package javaclub5.OOP.task50;

public class Rectangle extends  Figure{
    public Rectangle(float high, float length){
        super.high = high;
        super.length = length;
    }

    @Override
    public float getArea() {
        return high*length;
    }
}
