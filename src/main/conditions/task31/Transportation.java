package main.conditions.task31;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.util.Scanner;

public class Transportation implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static int rentalCarCost(int d) {
        int price = d*40;
        if(d>=3 && d<7){
            price -= 20;
        }
        else if(d>=7){
            price -= 50;
        }
        return price;
    }

    @Override
    public void execute() {
        System.out.println("Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.");
        System.out.println("Enter number of days: ");
        System.out.println(Transportation.rentalCarCost(scanner.nextInt()));
    }

}
