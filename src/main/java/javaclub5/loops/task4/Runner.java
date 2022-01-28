package javaclub5.loops.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Runner {

    public static void start(BufferedReader reader) {
        System.out.println("Give me an array of integers, i'll return a new array with each value doubled.");
        System.out.println("Input the length of array");
        try {
            int length = Integer.parseInt(reader.readLine());
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.printf("Input %d element of array\n", i + 1);
                arr[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println("Your array:");
            System.out.println(Arrays.toString(arr));
            System.out.println("Doubled array");
            System.out.println(Arrays.toString(map(arr)));
        } catch (IOException e) {
            System.out.println("Wrong Input");
        }

    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
