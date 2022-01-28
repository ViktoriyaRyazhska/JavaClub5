package main.conditions.task29;

import main.InterfaceTestClass;

import java.util.Scanner;

public class SwitchItUp implements InterfaceTestClass {
    Scanner myObj = new Scanner(System.in);
    public static String switchItUp(int number)
    {

        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "None";
        }
    }

    @Override
    public void execute() {
        System.out.println("When provided with a number between 0-9, return it in words.");
        System.out.println("Enter number: ");
        int  number = myObj.nextInt();
        System.out.println(SwitchItUp.switchItUp(number));

    }
}
