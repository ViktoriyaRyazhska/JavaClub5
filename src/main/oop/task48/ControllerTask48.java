package main.oop.task48;

import main.InterfaceTestClass;

import java.io.IOException;
import java.util.Scanner;

import static main.oop.task48.Dih4.*;

public class ControllerTask48 implements InterfaceTestClass {
    public static Dih4 result;
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("There are exactly eight ways to map a square onto itself by rotation or reflection." +
                " We can take its mirror image (reflection in horizontal, vertical, or either of two 45-degree " +
                "diagonal lines); rotate it (by 90 degrees clockwise, 90 degrees anti-clockwise, or 180 degrees); " +
                "or just leave it alone.");

        result = IDENTITY;
        int yourSelect;
        System.out.println("Menu:");
        System.out.println("""
                1. Identity transformation;
                2. Rotation 90 degrees anticlockwise;
                3. Rotation 180 degrees;
                4. Rotation 90 degrees clockwise;
                5. Reflection in vertical line;
                6. Reflection in forward-diagonal line;
                7. Reflection in horizontal line;
                8. Reflection in reverse-diagonal line.""");
        System.out.println("Select action you want to do:");
        yourSelect = scanner.nextInt();
        System.out.println("Result of your action:");
        switch (yourSelect) {
            case 1 -> {
                result = result.then(IDENTITY);
                if (result != null) {
                    System.out.println("Square -> " + result);
                }
            }
            case 2 -> {
                result = result.then(ROTATE_90_ANTICLOCKWISE);
                if (result != null) {
                    System.out.println("Square -> " + result);
                }
            }
            case 3 -> {
                result = result.then(ROTATE_180);
                if (result != null) {
                    System.out.println("Square -> " + result);
                }
            }
            case 4 -> {
                result = result.then(ROTATE_90_CLOCKWISE);
                if (result != null) {
                    System.out.println("Square -> " + result);
                }
            }
            case 5 -> {
                result = result.then(REFLECT_VERTICAL);
                if (result != null) {
                    System.out.println("Square -> " + result);
                }
            }
            case 6 -> {
                result = result.then(REFLECT_FORWARD_DIAGONAL);
                if (result != null) {
                    System.out.println("Square -> " + result);
                }
            }
            case 7 -> {
                result = result.then(REFLECT_HORIZONTAL);
                if (result != null) {
                    System.out.println("Square -> " + result);
                }
            }
            case 8 -> {
                result = result.then(REFLECT_REVERSE_DIAGONAL);
                if (result != null) {
                    System.out.println("Square -> " + result);
                }
            }
            default -> {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Wrong input!");
                }
            }
        }
    }

}