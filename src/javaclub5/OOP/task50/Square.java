package javaclub5.OOP.task50;

public class Square extends Figure {
public Square(float side){
    super.side = side;
}

    @Override
    public float getArea() {
        return side*side;
    }
}
