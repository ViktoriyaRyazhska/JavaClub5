package javaclub5.conditions.task27;

import java.util.Scanner;

public class Task27 {

    public static int bus(int cap, int on, int wait){
        if(on+wait<=cap){
            System.out.println("Driver can fit all " + wait + " passengers");
        }else
            System.out.println("Driver can't fit " + (on+wait-cap)+ " of the " + wait + " waiting");
        System.out.print("Now on a bus: ");
        return on+wait;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of people the bus can hold excluding the driver(cap): ");
        int cap = sc.nextInt();
        System.out.println("Enter the number of people on the bus excluding the driver(on): ");
        int on = sc.nextInt();
        System.out.println("Enter the number of people waiting to get on to the bus excluding the driver(wait): ");
        int wait = sc.nextInt();
        System.out.println(bus(cap,on,wait));
    }
}
