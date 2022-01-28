package main.conditions.task27;

import main.InterfaceTestClass;
import main.conditions.task22.AgeDiff;
import main.conditions.task27.Bob;
import java.util.Scanner;
public class Bob implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static int enough(int cap, int on, int wait) {
        int cant = cap - on - wait;
        return cant >= 0 ? 0 : Math.abs(cant);
    }

    @Override
    public void execute() {
        System.out.println("Implement a program telling driver if he will be able to fit all the passengers.");
        System.out.println("You must enter three digits: ");
        System.out.println("Enter the amount of people the bus can hold excluding the driver: ");
        try {
            int car = scan.nextInt();
            System.out.println("Enter the number of people on the bus excluding the driver.: ");
            int on = scan.nextInt();
            System.out.println("Enter the number of people waiting to get on to the bus excluding the driver.: ");
            int wait = scan.nextInt();
            System.out.println(Bob.enough(10, 5, 5));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}