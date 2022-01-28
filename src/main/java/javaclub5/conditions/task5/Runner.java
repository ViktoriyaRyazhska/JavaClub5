package javaclub5.conditions.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("In this task we will calculate your age in past, future and now.");
        System.out.println("Enter your year of birth:");
        try {
            int birth = Integer.parseInt(br.readLine());
            System.out.println("Enter year to calculate");
            int yearTo = Integer.parseInt(br.readLine());
            System.out.println("Result " + CalculateAge(birth,yearTo));
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }

    }
    public static String CalculateAge(int birth, int yearTo) {
        
        String rez;
        if(yearTo>birth){
            if((yearTo-birth) == 1)
                rez = "You are "+ (yearTo-birth) +" year old.";
            else
                rez = "You are "+ (yearTo-birth) +" years old.";
        }

        else if(yearTo<birth)
            if ((birth-yearTo) == 1)
                rez = "You will be born in "+(birth - yearTo) +" year.";
            else
                rez = "You will be born in "+(birth - yearTo) +" years.";
        else
            rez = "You were born this very year!";
        return rez;
    }
}
