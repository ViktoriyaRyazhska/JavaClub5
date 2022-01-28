package main.conditions.task26;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.util.Scanner;

public class BooleanToYesOrNo implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String boolToWord(boolean b)
    {
        if(b == true){
            return "Yes";
        }
        return "No";
    }



    @Override
    public void execute() {
        System.out.println("Complete the method that takes a boolean value and return a \"Yes\" string for true, or a \"No\" string for false.");
        System.out.println("Enter \"true\" or \"false\": ");

        try {
            String trueOrFalse = scanner.nextLine();

            Boolean flag = false;
            Boolean rerun = false;
            if(trueOrFalse.equalsIgnoreCase("false")){
                flag = false;
            }
            else if(trueOrFalse.equalsIgnoreCase("true")){
                flag = true;
            }
            else{
                System.out.println("Please enter \"true\" or \"false\"");
                rerun = true;
                execute();
            }
            if(!rerun) {
                System.out.println(BooleanToYesOrNo.boolToWord(flag));
            }
        }
        catch (Exception e) {
            System.out.println("Check if your input is correct");
            System.err.println(e.getMessage());
        }

    }
}
