package solutions.loops;

import solutions.Executable;

import java.util.Arrays;
import java.util.Scanner;

public class BeginnerLostWithoutMap implements Executable {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }

    @Override
    public void execute() {
        System.out.println("Enter array size: ");
        int arrSize = new Scanner(System.in).nextInt();
        if (arrSize == 0) {
            throw new NegativeArraySizeException("Введіть число більше за 0");
        } else {
            int[] arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                System.out.println("Enter " + (i + 1) + " number:");
                arr[i] = new Scanner(System.in).nextInt();
            }
            System.out.println(Arrays.toString(map(arr)));
        }
    }
}
