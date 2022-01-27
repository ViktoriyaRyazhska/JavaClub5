package javaclub5.conditions.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("In this task checking if we got bonus for salary or no.");
        System.out.println("Enter your salary");
        try {
            int salary = Integer.parseInt(br.readLine());
            System.out.println("Press y if you hava a bonus and n if you don't");
            String bonusStr = br.readLine();
            boolean bonus = false;
            if(bonusStr.equals("y"))
                bonus = true;
            else if (bonusStr.equals("n"))
                bonus = false;
            else
                System.out.println("Wrong input");
            System.out.println("Result " + bonusTime(salary,bonus));
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }
    }

    public static String bonusTime(int salary, final boolean bonus) {
        // show me the code!
        if(bonus){
            salary*=10;
        }
        String rez = "\u00A3"+ salary;
        return rez;

    }
}
