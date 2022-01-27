package javaclub5.conditions.task31;

import java.util.Scanner;

public class Task31 {
    private static final int cost=40;
    public static int rentCar(int days){
        if(days<3 && days>0){return days*cost;}
        else if(days>=3&&days<7){return days*cost-20;}
        else if (days>=7){return days*cost-50;}
        else if (days<0){return 0;}
        return 0;
    }

    public static void main(Scanner sc) {
        try {
            System.out.println("Enter amount of days:");
            int days = sc.nextInt();
            System.out.println("Rent will cost:" + rentCar(days) + "$");
        }catch(Exception e){
            System.out.println("Wrong input");
        }
    }
}
