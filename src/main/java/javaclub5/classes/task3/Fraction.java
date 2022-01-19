package javaclub5.classes.task3;
/**
 *
 * class 'Fraction', which accepts two arguments (numerator, denominator).
 *
 * @author Rostyslav Ros
 */

public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * constructor Fraction with two parameters
     * @param denominator - denominator
     * @param numerator - numerator
     */

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * calculate the sum current fraction and another
     * @param fraction:  another fraction
     * @return object Fraction (sum of two fractions)
     */
    public Fraction add(Fraction fraction) {
        int newNumerator = fraction.getNumerator() * this.denominator + fraction.getDenominator() * this.numerator;
        int newDenominator = fraction.getDenominator() * this.denominator;
        for (int i = newNumerator; i > 0; i--) {
            if (newDenominator % i ==0 && newNumerator % i == 0) {
                newDenominator = newDenominator / i;
                newNumerator = newNumerator / i;
            }
        }
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return "Outputs: " + numerator;
        }
        else {
            return "Outputs: " + numerator + "/" +
                    denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
