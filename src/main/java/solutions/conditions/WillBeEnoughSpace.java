package solutions.conditions;

import solutions.Executable;

import java.util.Scanner;

public class WillBeEnoughSpace implements Executable {
    public static int enough(int cap, int on, int wait){
        // your code here
        if(cap-on>=wait) return 0;
        else return Math.abs(cap-on-wait);
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter capacity, passengers and waiters");
        int cap = scanner.nextInt();
        int on = scanner.nextInt();
        int wait = scanner.nextInt();
        if(cap<=0||on<0||wait<0||on>cap) throw new IllegalArgumentException();
        System.out.println(enough(cap,on,wait));
    }
}
