package main.basicprogram.task24;
import java.util.Scanner;
import main.InterfaceTestClass;

public class BasicMath implements InterfaceTestClass {
    Scanner myObj = new Scanner(System.in);
    public static Integer basicMath(String op, int v1, int v2)
    {int result = 0;
        if(op == "+")result= v1 + v2;
        else if(op == "-")result= v1 - v2;
        else if(op == "*")result= v1 * v2;
        else if(op == "/")result= v1 / v2;
        return result;
    }
    @Override
    public void execute() {
        System.out.println("Your task is to create a function that does four basic mathematical operations.\n" +
                "\n" +
                "The function should take three arguments - operation(string/char), value1(number), value2(number).\n" +
                "The function should return result of numbers after applying the chosen operation.");
        System.out.println("Enter vaule +,-,*,/: ");
        String op = myObj.nextLine();
        System.out.println("Enter vaule of number 1: ");
        int v1 = myObj.nextInt();
        System.out.println("Enter vaule of number 2: ");
        int v2 = myObj.nextInt();

    }
}
