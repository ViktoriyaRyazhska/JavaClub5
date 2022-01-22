package com.coftserve.BasicProgram;
import com.coftserve.Input;
import com.coftserve.MainClass;

import java.io.BufferedReader;
import java.io.IOException;


public class Task1 extends Input  {
    
    static int number;
    
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Task1 is starting!");
        System.out.println("You need to enter an integer and double it !!!");
        System.out.println("Please input number");
        
        
        if(isInteger(br)) {
            System.out.println("Double Integer is " + number*2);
        } else {
            System.out.println("==> It's not an integer! Try again! <==");
            Task1.main(args);
        }    
                
        System.out.println("Beak to main menu => input 1 ");
        System.out.println("Try again  => input 2 ");
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                case "2":
                    Task1.main(args);
                    break;
                default:
                    System.err.println("You need to do this: put 1 or 2 ");
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
