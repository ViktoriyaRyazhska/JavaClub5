package main.loops.task42;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;
import java.util.Scanner;
public class TwiceAsOld implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static int TwiceAsOld(int dadYears, int sonYears) {

        return (int) Math.abs(dadYears - sonYears * 2);
    }

    @Override
    public void execute() {
        System.out.println("Implement a function which сalculate how many years ago the father was twice as old as his son ");
        System.out.println("You must enter two digits. ");
        System.out.println("Lets enter dad years: ");
        try {
            int dadYears = scan.nextInt();
            System.out.println("Lets enter son years: ");
            int sonYears = scan.nextInt();
            System.out.println(TwiceAsOld.TwiceAsOld(dadYears, sonYears));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}