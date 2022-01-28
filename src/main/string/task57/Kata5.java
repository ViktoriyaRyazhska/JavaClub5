package main.string.task57;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;

import java.util.Scanner;
public class Kata5 implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static String noSpace(final String x) {

        return x.replace(" ", "");

    }

    @Override
    public void execute() {
        System.out.println("Implement a function which remove the spaces from the string, then return the resultant string.");
        System.out.println("You must enter sentence. ");
        System.out.println("Lets enter sentence: ");
        try {
            String sentence = scan.nextLine();
            System.out.println(Kata5.noSpace(sentence));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}