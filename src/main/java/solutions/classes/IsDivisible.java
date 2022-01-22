package solutions.classes;

import solutions.Executable;

import java.util.Scanner;

public class IsDivisible implements Executable {
    public static boolean isDivisible(long n, long x, long y) {
        // your code
        return n % x == 0 && n % y == 0;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        if(n<=0||x<=0||y<=0) throw new IllegalArgumentException();
        System.out.println(isDivisible(n,x,y));
    }

}
