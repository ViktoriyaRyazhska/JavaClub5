package main.oop.task50;

public class Rectangle extends Figure {

    public Rectangle(double height, double width) {
        super.height = height;
        super.width = width;
    }

    @Override
    public double gretArea() {
        return height* width;
    }
}
