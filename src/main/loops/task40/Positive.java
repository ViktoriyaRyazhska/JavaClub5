package main.loops.task40;

import main.InterfaceTestClass;

import java.util.Scanner;

public class Positive implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0)
                sum += arr[i];
        }
        return sum;
    }

    @Override
    public void execute() {
        System.out.println("You get an array of numbers, return the sum of all of the positives ones.");
        System.out.println("How much numbers you want to specify?");
        int number = scanner.nextInt();
        System.out.println("Please fill the array with " + number + " numbers.");
        int [] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Positive.sum(arr));

    }
}
