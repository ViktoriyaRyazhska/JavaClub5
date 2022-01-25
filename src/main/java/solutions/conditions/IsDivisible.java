package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class IsDivisible implements Executable {
    public static boolean isDivisible(long n, long x, long y) {
        // your code
        if(x==0 || y ==0)
        {
            throw new ArithmeticException("Can't be devided by 0");

        }
        return n % x == 0 && n % y == 0;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        long n = Helper.getLong(1,1000);
        long x = Helper.getLong(1,1000);
        long y = Helper.getLong(1,1000);
        System.out.println(isDivisible(n,x,y));
    }

}
