package main.loops.task35;

import main.InterfaceTestClass;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Maps implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static int[] map(int[] arr) {
        int [] doubledArr = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            doubledArr[i] = arr[i]*2;
        }
        return doubledArr;
    }

    @Override
    public void execute() {
        int number = 0;
        System.out.println("Given an array of integers, return a new array with each value doubled");
        System.out.println("How much numbers you want to specify?");
        try {
            number = scanner.nextInt();
            System.out.println("Please fill the array with " + number + " numbers.");
            int[] arr = new int[number];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(Arrays.toString(Maps.map(arr)));
        }catch (InputMismatchException | NumberFormatException exception){
            System.out.println("Wrong input!");
        }
    }
}