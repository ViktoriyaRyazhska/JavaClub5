package solutions.loops;

import solutions.Executable;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPozitive implements Executable {
    int[] arr;

    public static int sum(int[] arr){

        return Arrays.stream(arr).filter(x->x>=0).sum();
    }

    public void getData()
    {
        System.out.println("Enter array size: ");
        int arrSize= new Scanner(System.in).nextInt();
        if(arrSize == 0)
        {
            throw new NegativeArraySizeException("The number must be greater than 0");
        }
        else {
            this.arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                System.out.println("Enter "+(i+1)+" number:");
                this.arr[i] = new Scanner(System.in).nextInt();
            }
        }
    }



    @Override
    public void execute() {
        getData();
        System.out.println("Sum of positive is equal to "+sum(this.arr));
    }
}
