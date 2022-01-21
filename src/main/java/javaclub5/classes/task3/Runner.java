package javaclub5.classes.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 /**
 *
 * You are provided with a skeleton of the class 'Fraction', which accepts two arguments (numerator, denominator).
 * EXAMPLE:
 * Fraction fraction1 = new Fraction(4, 5);
 * Your task is to make this class string representable, and addable while keeping the result
 * in the minimum representation possible.
 * EXAMPLE:
 * System.out.println(fraction1.add(new Fraction(1, 8)));
 * // Outputs: 37/40
 *
 * NB: DON'T use the built_in class 'fractions.Fraction'
 *
 * @author Rostyslav Ros
 */

public class Runner {
    public static void main(String[] args) {
        start();
    }
    /**
     * main method of Class
     *
     */
    public static void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input two fractions");
        try {
            System.out.println("Input first fraction");
            System.out.println("Input first numerator");
            int firstNumerator = Integer.parseInt(reader.readLine());
            System.out.println("Input first denominator");
            int firstDenominator = Integer.parseInt(reader.readLine());
            Fraction firstFraction = new Fraction(firstNumerator, firstDenominator);
            System.out.println("Yours first fraction wil be: " + firstFraction);
            System.out.println("Input second fraction");
            System.out.println("Input second numerator");
            int secondNumerator = Integer.parseInt(reader.readLine());
            System.out.println("Input second denominator");
            int secondDenominator = Integer.parseInt(reader.readLine());
            Fraction secondFraction = new Fraction(secondNumerator, secondDenominator);
            System.out.println("Yours second fraction wil be: " + secondFraction);
            System.out.println("Sum of fractions will be: " + firstFraction.add(secondFraction));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
