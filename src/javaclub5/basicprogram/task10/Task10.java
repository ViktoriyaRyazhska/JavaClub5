package javaclub5.basicprogram.task10;

import java.util.Scanner;

public class Task10 {
    public static String datingRange(int x){
        float min=x/2+7;
        float max=(x-7)*2;
        if(x<=14){
            min =(x-0.10f*x);
            max =x+0.10f*x;
        }
        return ((int)min+"-"+(int)max);
    }
    public static void main(Scanner sc) {
        try {
            System.out.println("Enter age");
            int x= sc.nextInt();
            System.out.println("Your range of dating age:"+datingRange(x));
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}
