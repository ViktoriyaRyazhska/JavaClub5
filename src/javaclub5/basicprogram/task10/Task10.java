package javaclub5.basicprogram.task10;

import java.util.Scanner;

public class Task10 {
    public String datingRange(int x){
        float min=x/2+7;
        float max=(x-7)*2;
        if(x<=14){
            min =(x-0.10f*x);
            max =x+0.10f*x;
        }
        return ((int)min+"-"+(int)max);
    }/*
    public static void main(String[] args) {
        Task10 obj = new Task10();
        Scanner sc = new Scanner(System.in);

        try {
            int x= sc.nextInt();
            System.out.println(obj.datingRange(x));
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }*/
}
