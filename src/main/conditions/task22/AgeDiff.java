package main.conditions.task22;
import main.InterfaceTestClass;

import java.util.Scanner;


public class AgeDiff implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static String CalculateAge(int birth, int yearTo) {
        if (birth < yearTo) {
            if (yearTo - birth == 1) {
                return "You are 1 year old.";
            } else {
                return String.format("You are %s years old.", yearTo - birth);
            }
        } else if (birth > yearTo) {
            if (birth - yearTo == 1) {
                return "You will be born in 1 year.";
            } else {
                return String.format("You will be born in %s years.", birth - yearTo);
            }
        } else if (birth == yearTo) {
            return "You were born this very year!";
        } else {
            return "Error!";
        }

    }

    @Override
    public void execute() {
        System.out.println("Implement a function that calculate age.");
        System.out.println("You must enter two digits: ");
        System.out.println("Enter the date of your birth: ");
        try {
            int birth = scan.nextInt();
            System.out.println("Enter the date of yearTo: ");
            int yearTo = scan.nextInt();
            System.out.println(AgeDiff.CalculateAge(birth, yearTo));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}