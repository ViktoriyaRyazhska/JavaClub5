package javaclub5.conditions.task20;

import java.util.Scanner;

public class Task20 {

    //Implement a function which convert the given boolean value into its string representation.

    public static void start(Scanner scanner) {
        System.out.println("Write 'true' or 'false' ");
        boolean b1 = scanner.hasNextBoolean();
        String convert = Boolean.toString(b1);
        System.out.println("Your result : " + convert);
    }
}