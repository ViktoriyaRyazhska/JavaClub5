package main.loops.task38;

import main.InterfaceTestClass;

import java.util.Arrays;
import java.util.Scanner;

public class BestStudent implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double average = 0;
        for (int i = 0; i <= classPoints.length; i++) {
            average = Arrays.stream(classPoints).sum();
        }
        average = (average + yourPoints) / (classPoints.length + 1);
        return yourPoints > average;
    }

    @Override
    public void execute() {
        int num;
        System.out.println("There was a test in your class and you passed it. Congratulations!\n" +
                "But you're an ambitious person. You want to know if you're better than the average students in your class.");
        System.out.println("Enter the number of your peers:");
        num = scanner.nextInt();
        int[] classPoints = new int[num];
        System.out.println("Enter your peers' test scores:");
        for (int i = 0; i < num; i++) {
            classPoints[i] = scanner.nextInt();
        }
        System.out.println("Enter your score:");
        int yourPoint = scanner.nextInt();
        if (BestStudent.betterThanAverage(classPoints, yourPoint)) {
            System.out.println("Congratulations! You're better than the average students in your class.");
        } else System.out.println("Sorry, but your point is lower than the average students in your class.");
    }
}
