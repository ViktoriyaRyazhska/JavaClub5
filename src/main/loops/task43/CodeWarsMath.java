package main.loops.task43;

import main.InterfaceTestClass;

import java.util.Scanner;

public class CodeWarsMath implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int nearestSq(final int n) {
        int n1 = (int) Math.sqrt(n);

        if (n1 * n1 == n)
            return n;
        else {
            int floorSquare = n1 * n1;
            int ceilingSquare = (n1 + 1) * (n1 + 1);
            if (Math.abs(floorSquare - n) < Math.abs(ceilingSquare - n))
                return floorSquare;
            else
                return ceilingSquare;
        }
    }

    @Override
    public void execute() {
        System.out.println("Please enter the number you want to find the nearest square number:");
        int n = scanner.nextInt();
        System.out.println("Result: " + CodeWarsMath.nearestSq(n));
    }
}
