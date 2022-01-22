package solutions.conditions;

import solutions.Executable;

import java.util.Scanner;

public class TransportationOnVacation implements Executable {
    public static int rentalCarCost(int d) {
        if(d<3) return d*40;
        return d<7 ? d*40-20:d*40-50;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter capacity, passengers and waiters");
        int d = scanner.nextInt();

        if(d<0) throw new IllegalArgumentException();
        System.out.println(rentalCarCost(d));
    }
}
