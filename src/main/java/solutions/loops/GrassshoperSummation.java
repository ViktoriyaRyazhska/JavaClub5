package solutions.loops;

import solutions.Executable;

import java.util.Scanner;

public class GrassshoperSummation implements Executable {
    int n;

    public static int summation(int n) {
        if(n<0)
            throw new ArithmeticException("The number must be greater than 0");
        int sum=0;
        for(int i = 0; i <= n; ++i)
        {
            sum += i;
        }

        return sum;
    }

    public void getData()
    {
        System.out.println("Enter how many elements will be in sequence: ");
        this.n = new Scanner(System.in).nextInt();

    }


    @Override
    public void execute() {
        getData();
        System.out.println("Sum of elements: "+summation(this.n));
    }
}
