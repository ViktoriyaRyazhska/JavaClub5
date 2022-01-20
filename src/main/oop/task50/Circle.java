package main.oop.task50;

public class Circle extends Figure {

    public Circle(double radius) {
        super.radius = radius;
    }

    @Override
    public double gretArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
