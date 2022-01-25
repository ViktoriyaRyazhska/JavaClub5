package javaclub5.loops.task40;

import java.util.Scanner;

public class Task40 {
    public static void start(Scanner scanner) {
        try {
            System.out.println("Enter size of your array: ");
            int x = scanner.nextInt();
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter value for "+i+" place in array:");
                arr[i] = scanner.nextInt();
            }
            System.out.println("Sum of all Positive numbers in array will be: "+reverse(arr));
        } catch (Exception e) {

        }

    }

    public static int reverse(int[] arr) {
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            if (arr[i]<0){
                arr[i] = 0;
            }
            sum = sum + arr[i];
        }
        return sum;
    }
}
