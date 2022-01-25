package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

public class FibonacciModulo implements Executable {
    int n;

    public static int fib(int n) {
        int n1 = 0, n2 = 1, n3 = 0, i, count = 5;
        if(n<3) throw new IllegalArgumentException("Enter number greater than 3!");
        for (i = 2; i < n; ++i) {
            n3 = (n1 + n2) % 3;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }


    public void getData() {
        System.out.println("Enter sequence number: ");
        this.n = Helper.getInt(3, 1000000);
    }


    @Override
    public void execute() {
        getData();
        System.out.println(fib(this.n));
    }
}
