package solutions.conditions;

import solutions.Executable;

import java.util.Scanner;

public class FibonacciModulo implements Executable {
    int n;

    public static int fib(int n)
    {
        int n1=0,n2=1,n3=0,i,count=5;


        for(i=2;i<n;++i)
        {
            n3=(n1+n2)%3;
            n1=n2;
            n2=n3;
        }

        return n3;
    }


    public void getData()
    {
        System.out.println("Enter sequence number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<3)
            System.out.println("Greater number is needed");
        else
            this.n=n;
    }



    @Override
    public void execute() {
        getData();
        System.out.println(fib(this.n));
    }
}
