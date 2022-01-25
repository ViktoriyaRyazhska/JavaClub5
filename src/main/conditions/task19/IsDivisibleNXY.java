package main.conditions.task19;

import main.InterfaceTestClass;

import java.util.Scanner;

public class IsDivisibleNXY implements InterfaceTestClass {
    Scanner myObj = new Scanner(System.in);
    public static boolean isDivisible(long n, long x, long y) {
        boolean res = false;
        if(n%x == 0 && n%y == 0){ res = true;}
        return n%x==0 && n%y==0;
    }
    @Override
    public void execute() {
        System.out.println("Create a function that checks if a number n is"+"" +
                " divisible by two numbers x AND y. All inputs are positive,"+"" +
                " non-zero digits.");
        System.out.println("Enter n: ");
        long n = myObj.nextInt();
        System.out.println("Enter x: ");
        long x = myObj.nextInt();
        System.out.println("Enter y: ");
        long y = myObj.nextInt();


    }
}
