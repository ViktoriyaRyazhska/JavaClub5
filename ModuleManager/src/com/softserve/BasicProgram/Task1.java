package com.softserve.BasicProgram;

import com.softserve.Input;
import com.softserve.MainClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;


public class Task1 extends Input  {
    
    static int number;
    
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Task1 is starting!");
        System.out.println("You need to enter an integer and double it !!!");
        System.out.println("Please input number");        
        
        if(isInteger(br)) { 
            BigInteger doubleNumber = BigInteger.valueOf(number).sqrt();
            System.out.println("Double Integer is " + doubleNumber);
        } else {
            System.out.println("==> It's not an integer! Try again! <==");
            Task1.main(args);
        }    
                
        System.out.println("Beak to main menu => input 1 ");
        System.out.println("Try again  => input 2 ");
        System.out.println("To pass a test  => input 3 ");
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                    
                case "2":
                    Task1.main(args);
                    break;
                    
                case "3":
                    TestTask1.main(args);
                    break;
                    
                default:
                    System.err.println("You need to do this: put 1 or 2 or 3");
                    System.err.println("Transfer to menu ");
                    Task1.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected static boolean isInteger(BufferedReader br) {
	try {
	    number = Integer.parseInt(br.readLine());
	    return true;
	} catch (NumberFormatException | IOException e) {
	    return false;
	}
    }

}                                          
