package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start5TaskConditions;

public class Task5 extends ReadConsole {

    static int birth;
    static int yearTo;

    public static void main(String[] args) {

        start5TaskConditions();
        try {
            birth = Integer.parseInt(br.readLine());
            if(birth > 0){
                System.out.println("Enter question year");}
            else {
                System.out.println("==> Wrong input!!=) Try again! <==");
            }
            yearTo = Integer.parseInt(br.readLine());
            if(yearTo>0){
                System.out.println("Result: " + CalculateAge(birth,yearTo));
            }
            else {
                System.out.println("==> Wrong input!!=) Try again! <==");
        }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> Wrong input!!=) Try again! <==");
            Task5.main(args);
        }

    backToMenuOrRetry();
        try {
        switch (br.readLine()) {
            case "1":
                MainClass.main(args);
                break;

            case "2":
                Task5.main(args);
                break;

            default:
                System.err.println("You need to do this: put 1 or 2");
                System.err.println("Transfer to menu ");
                Task5.main(args);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public static String CalculateAge(int birth, int yearTo)
    {

        int age = yearTo - birth;

        if (age > 1) return "You are " + age + " years old.";
        if (age == 1) return "You are 1 year old.";
        if (age == 0) return "You were born this very year!";
        if (age == -1) return "You will be born in 1 year.";
        return "You will be born in " + -age + " years.";

    }
}

