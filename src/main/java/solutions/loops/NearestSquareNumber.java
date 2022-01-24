package solutions.loops;

import program.helper.Helper;
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
        System.out.println("Enter number greater than 0");
        int n = Helper.getInt(1,1000);
        System.out.println(nearestSq(n));
    }
}
