package Task50;

public class Triangle extends Figure {

    public Triangle(double triangleBase, double triangleHeight) {
        super.triangleBase = triangleBase;
        super.triangleHeight = triangleHeight;
    }

    @Override
    public double gretArea() {
        return (triangleBase * triangleHeight) / 2;
    }
}
