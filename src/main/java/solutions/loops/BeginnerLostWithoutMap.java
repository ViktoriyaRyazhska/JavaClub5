package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.Arrays;
import java.util.Scanner;

public class BeginnerLostWithoutMap implements Executable {
    public static int[] map(int[] arr) {

        if(arr==null) throw new IllegalArgumentException("The array is null");
        return Arrays.stream(arr).map(x -> x * 2).toArray();
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
        System.out.println(Arrays.toString(map(arr)));
    }
}
