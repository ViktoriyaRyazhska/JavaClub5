package main.basicprogram.task44;

import main.InterfaceTestClass;

import java.util.Scanner;

public class Summation implements InterfaceTestClass {
    Scanner myObj = new Scanner(System.in);
    public static int summation(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum+=i;

        }

        return sum;
    }
    @Override
    public void execute() {
        System.out.println("Write a program that finds the summation of every number from 1 to num."+"" +
                " The number will always be a positive integer greater than 0.");
        System.out.println("Enter value: ");
        int  n = myObj.nextInt();

    }
}
