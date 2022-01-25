package javaclub5.conditions.task18;

import java.util.Scanner;

public class Task18 {
    public static void start(Scanner scanner){
        System.out.println("Enter a number ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Opposit number is " + oppositNumber(number));


    }

    public static int oppositNumber(int number){
        return 0 - number;
    }
}
