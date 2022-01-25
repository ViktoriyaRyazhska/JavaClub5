package javaclub5.loops.task42;


import java.util.Scanner;

public class Task42 {
    public int TwiceAsOld(int dadYears, int sonYears){
        return Math.abs(dadYears-(sonYears*2));
    }

    public static void main(Scanner sc) {
        Task42 obj = new Task42();
        try {
            System.out.println("Enter dad`s age:");
            int dadAge = sc.nextInt();
            System.out.println("Enter son`s age:");
            int sonAge = sc.nextInt();

            System.out.println("Dad was as twice as old as his son "+obj.TwiceAsOld(dadAge, sonAge)+"th years ago");
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}
