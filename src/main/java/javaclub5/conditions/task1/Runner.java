package javaclub5.conditions.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Very simple, given an integer or a floating-point number, find its opposite.
 * @author Dmytro Prudius
 */
public class Runner{

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("Enter pleas number: ");
        try {
            int number = Integer.parseInt(br.readLine());
            System.out.println("Result: " + opposite(number));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int opposite(int number) {
        return -number;
    }
}