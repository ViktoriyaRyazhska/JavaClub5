package Task50;

public class Calculator {

    public double getTotalArea(Figure... figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].gretArea();
        }
        return roundDouble(sum);
    }
    public double roundDouble(double d) {
        d = d * 100;
        int i = (int) Math.round(d);
        return (double) i/100;
    }

}


