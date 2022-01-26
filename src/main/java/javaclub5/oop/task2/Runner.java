package javaclub5.oop.task2;

import java.io.BufferedReader;
import java.io.IOException;

import static javaclub5.oop.task2.Dih4.*;

public class Runner {
    public static int i;
    public static Dih4 result;

    public static void start(BufferedReader reader) {
        System.out.println("There are exactly eight ways to map a square onto itself by rotation or reflection.");

        result = IDENTITY;
        do {
            System.out.println("Select what you want to do:");
            System.out.println("1. Identity transformation\n2. Rotation 90 degrees anticlockwise" +
                    "\n3. Rotation 180 degrees\n4. Rotation 90 degrees clockwise" +
                    "\n5. Reflection in vertical line\n6. Reflection in forward-diagonal line" +
                    "\n7. Reflection in horizontal line\n8. Reflection in reverse-diagonal line" +
                    "\n0. Exit");
            try {
                int selectionResult = selection(reader);
                if (selectionResult == 0) {
                    break;
                }
            } catch (IOException e) {
                System.out.println("Wrong input");
            }
        }
        while (i != 0);
    }
    public static int selection(BufferedReader reader) throws IOException {
        i = Integer.parseInt(reader.readLine());
        switch (i) {
            case 1 -> {
                result = result.then(IDENTITY);
                System.out.println("Status of square is: " + result.toString());
                return 1;
            }
            case 2 -> {
                result = result.then(ROTATE_90_ANTICLOCKWISE);
                System.out.println("Status of square is: " + result.toString());
                return 2;
            }
            case 3 -> {
                result = result.then(ROTATE_180);
                System.out.println("Status of square is: " + result.toString());
                return 3;
            }
            case 4 -> {
                result = result.then(ROTATE_90_CLOCKWISE);
                System.out.println("Status of square is: " + result.toString());
                return 4;
            }
            case 5 -> {
                result = result.then(REFLECT_VERTICAL);
                System.out.println("Status of square is: " + result.toString());
                return 5;
            }
            case 6 -> {
                result = result.then(REFLECT_FORWARD_DIAGONAL);
                System.out.println("Status of square is: " + result.toString());
                return 6;
            }
            case 7 -> {
                result = result.then(REFLECT_HORIZONTAL);
                System.out.println("Status of square is: " + result.toString());
                return 7;
            }
            case 8 -> {
                result = result.then(REFLECT_REVERSE_DIAGONAL);
                System.out.println("Status of square is: " + result.toString());
                return 8;
            }
            case 0 -> {
                return 0;
            }
            default -> throw new IOException();
        }
    }
}


