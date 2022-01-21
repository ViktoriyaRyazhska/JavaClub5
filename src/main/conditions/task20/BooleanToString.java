package main.conditions.task20;

import main.InterfaceTestClass;

import java.util.Scanner;

public class BooleanToString implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String convert(boolean b){
        if(b) {
            return "true";
        } else {
            return "false";
        }
    }

    @Override
    public void execute() {
        System.out.println("Implement a function which convert the given boolean \n value into its string representation.");
        System.out.println("Choose a digit: ");
        System.out.println("Dirit -> 1 -> Representation of \"true\" ");
        System.out.println("Dirit -> 2 -> Representation of \"false\" ");
        int x = scanner.nextInt();
        boolean ret = returner(x);
        System.out.println(BooleanToString.convert(ret).getClass().getName() + " -> " +
                BooleanToString.convert(ret));
    }

    public boolean returner(int x){
        return x == 1;
    }
}
