package javaclub5.conditions.task27;

import java.util.Scanner;

public class Task27 {

    public static int bus(int cap, int on, int wait){
        if(on+wait<=cap){
            System.out.println("Driver can fit all " + wait + " passengers");
            System.out.print("Now on a bus: ");
            return on+wait;
        }else
            System.out.println("Driver can't fit " + (on+wait-cap)+ " of the " + wait + " waiting");
        System.out.print("Max amount of people in this bus: ");
        return cap;
    }

    public static void main(Scanner scanner) {
        System.out.println("Enter amount of people the bus can hold excluding the driver(cap): ");
        int cap = scanner.nextInt();
        System.out.println("Enter the number of people on the bus excluding the driver(on): ");
        int on = scanner.nextInt();
        System.out.println("Enter the number of people waiting to get on to the bus excluding the driver(wait): ");
        int wait = scanner.nextInt();
        System.out.println(bus(cap,on,wait));
    }
}
