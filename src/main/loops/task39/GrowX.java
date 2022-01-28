package main.loops.task39;

import main.InterfaceTestClass;

import java.util.Scanner;

public class GrowX implements InterfaceTestClass {
    Scanner myObj = new Scanner(System.in);

    public static int grow(int[] x,int size){

        int sum = 1;
        for(int i = 0;i<size;i++){
            sum*=x[i];

        }

        return sum;

    }
    @Override
    public void execute() {
        System.out.println("Given a non-empty array of integers,"+"" +
                " return the result of multiplying the values together in order.");
        System.out.println("Enter size: ");
        int size = myObj.nextInt();
        int[] x = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Enter value: ");
            x[i] = myObj.nextInt();
        }
        System.out.println(GrowX.grow(x,size));

    }
}
