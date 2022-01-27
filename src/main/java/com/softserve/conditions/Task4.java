package main.java.com.softserve.conditions;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start4Conditions;

public class Task4 extends ReadConsole {
    static int salary;
    static int yesOrNo;
    public static void main(String[] args) {
        start4Conditions();
        try {
            salary = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Wrong input! Try again! ");
            Task4.main(args);
        }
        System.out.println("If u get BONUS enter - \"1\" if u dint enter \"2\"");

        try {
            yesOrNo = Integer.parseInt(br.readLine());
            if (yesOrNo<=0||yesOrNo>2){
                System.out.println("You have only 2 choices");
                System.out.println("Lets try again");
                Task4.main(args);
            }
        } catch (IOException e) {
            System.out.println("Wrong Input!");
            Task4.main(args);
        }

        boolean userChoice = isBool(yesOrNo);
        System.out.println("Now lets se result.");

        System.out.println("Result: "+bonusTime(salary,userChoice));

        backToMenuOrRetry();

        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task4.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task4.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static boolean isBool(int i ){
        return (i==1);
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        return String.format("£%d", bonus ? salary * 10 : salary);
    }
}
