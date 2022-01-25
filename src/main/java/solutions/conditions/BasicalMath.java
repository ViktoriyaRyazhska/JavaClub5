package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class BasicalMath implements Executable {
    String op;
    int v1;
    int v2;

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                if (v2 == 0) {
                    throw new ArithmeticException("Can't be divided by 0");

                } else {
                    return v1 / v2;
                }
            default:
                throw new IllegalArgumentException("Unknown symbol");
        }
    }

    public void getData() {

        System.out.print("Enter first number: ");
        this.v1 = Helper.getInt(1000000);
        System.out.print("Enter second number: ");
        this.v2 = Helper.getInt(1000000);

        System.out.print("Enter operation like '+' or '-' or '/' or '*': ");
        this.op = Helper.getLine();

    }


    @Override
    public void execute() {
        getData();
        System.out.println(basicMath(this.op, this.v1, this.v2));
    }
}
