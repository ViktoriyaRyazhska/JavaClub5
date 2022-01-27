package javaclub5.OOP.task53;

import java.util.Scanner;

public class Task53 {
    public static void start (Scanner scanner){
        try {
            String [] str = new String[4];
            System.out.println("Enter ur FirstName: ");
            str[0]=scanner.nextLine();
            System.out.println("Enter ur LastName: ");
            str[1]=scanner.nextLine();
            System.out.println("Enter place whr are we coming for(2 words): ");
            str[2]=scanner.nextLine();
            System.out.println("Enter place whr are we coming for(2 words): ");
            str[3]=scanner.nextLine();
            System.out.println(methodHello(str));

        }catch (Exception e){

        }
    }
    public static Object methodHello (String[] str){
        System.out.println("Hello mr. "+str[0]+" "+str[1]+"!");
        System.out.println("Welcome to "+str[2]+" "+str[3]+"...");
        return "";
    }
}
