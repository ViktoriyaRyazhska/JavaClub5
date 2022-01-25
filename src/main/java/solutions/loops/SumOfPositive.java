package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPositive implements Executable {
    int[] arr;

    public static int sum(int[] arr){
        if(arr==null) throw new IllegalArgumentException("The array is null");
        return Arrays.stream(arr).filter(x->x>=0).sum();
    }

    public void getData()
    {
        System.out.println("Enter array size: ");
        int arrSize= Helper.getInt(1,10000);

            this.arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                System.out.println("Enter "+(i+1)+" number:");
                this.arr[i] = new Scanner(System.in).nextInt();
             }
    }



    @Override
    public void execute() {
        getData();
        System.out.println("Sum of positive is equal to "+sum(this.arr));
    }
}
