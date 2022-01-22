package javaclub5.oop.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            reader.readLine();
            Figure circle = new Circle(5);
            System.out.println(Calculator.getTotalArea(circle));
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }
}
