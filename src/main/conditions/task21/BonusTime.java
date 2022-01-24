package main.conditions.task21;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class BonusTime implements InterfaceTestClass {

    Scanner scanner = new Scanner(System.in);


    public static String bonusTime(final int salary, final boolean bonus) {
        if(bonus){
            return "\u00A3" +  Integer.toString(salary*10);
        }
        else  return "\u00A3" + Integer.toString(salary);
    }

    @Override
    public void execute() {
        System.out.println("It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?\n" +
                "Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.\n" +
                "If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.\n" +
                "Return the total figure the individual will receive as a string prefixed with \"£\"");
        System.out.println("Enter salary of employee: ");
        int salary = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Will our employee have a bonus (enter Yes or No): ");
        String yesOrNo = scanner.nextLine();
        Boolean flag = false;
        Boolean rerun = false;

        if(yesOrNo.equalsIgnoreCase("no")){
            flag = false;
        }
        else if(yesOrNo.equalsIgnoreCase("yes")){
            flag = true;
        }
        else{
            System.out.println("Please enter Yes or No ");
            rerun = true;
            execute();
        }
        if(!rerun) {
            System.out.println("Here is the salary for employee: " + BonusTime.bonusTime(salary, flag));
        }
    }
}
