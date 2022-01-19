package Task50;

public class Square extends Figure {

    public Square(double squareSide) {
        super.side = squareSide;
    }

    @Override
    public double gretArea() {
        return Math.pow(side, 2);
    }
}
