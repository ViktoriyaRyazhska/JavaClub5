package javaclub5.conditions.task24;

import java.util.Scanner;

public class Task24 {
    public static void start (Scanner scanner){
        String s;
        int a;
        int b;

        try {
            System.out.println("Input operator (+,-,*,/): ");
            System.out.println(s=scanner.nextLine());
            System.out.println("Input value 1: ");
            System.out.println(a=scanner.nextInt());
            System.out.println("Input value 1: ");
            System.out.println(b=scanner.nextInt());

            System.out.println("result is: "+ result(s,a,b));
        } catch (Exception e){
            System.out.println(" papapa");
        }
    }
    public static int result (String s, int a, int b){
        int res = 0;
        switch (s){
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "/":
                res = a / b;
                break;
            case "*":
                res = a * b;
                break;
        }
        return res;
    }
}
