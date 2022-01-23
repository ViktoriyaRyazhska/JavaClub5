package solutions.loops;

import solutions.Executable;

import java.util.Scanner;

public class NearestSquareNumber implements Executable {
    public static int nearestSq(final int n){
        int p;
        p= (int) (Math.sqrt(n)%1>0.5?Math.sqrt(n)+1:Math.sqrt(n));
        return p*p;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number greater than 0");
        int n = scanner.nextInt();
        if(n<0) throw new IllegalArgumentException();
        System.out.println(nearestSq(n));
    }
}
