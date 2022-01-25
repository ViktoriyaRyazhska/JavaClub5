package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class BeginnerReduceButGrow implements Executable {
    public static int grow(int[] x) {
        if(x==null) throw new IllegalArgumentException("The array is null");
        int product = 1;
        for (int i : x) {
            product *= i;
        }
        return product;

    }

    @Override
    public void execute() {
        System.out.println("Enter array size: ");
        int arrSize = Helper.getInt(1, 100);
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter " + (i + 1) + " number:");
            arr[i] = Helper.getInt(-100, 100);
        }
        System.out.println(grow(arr));
    }
}
