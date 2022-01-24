package javaclub5.oop.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javaclub5.oop.task4.SelectionMenu.selectFigure;

/**
 * Task:
 * Implement:
 *     Calculator.getTotalArea()
 *     Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`
 *
 * @author Rostyslav Ros
 */


public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }

    /**
     * main method of Class
     *
     */
    public static void start(BufferedReader reader) {
        try {
            System.out.println("The area will be: " + Calculator.getTotalArea(selectFigure(reader)));
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}
