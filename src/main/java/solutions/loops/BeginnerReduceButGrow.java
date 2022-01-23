package solutions.loops;

import solutions.Executable;

import java.util.Scanner;

public class BeginnerReduceButGrow implements Executable {
    public static int grow(int[] x) {
        int product=1;
        for (int i : x) {
            product*=i;
        }
        return product;

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
            System.out.println(grow(arr));
        }
    }
}
