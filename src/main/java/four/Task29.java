package four;

import five.Task05;
import five.Task10;
import one.Task01;
import one.Task06;
import two.Task02;
import two.Task07;

import java.io.BufferedReader;

public class Task29 {
    public static String switchItUp(int number)
    {
        switch (number){
            case 1 : {return "One";}
            case 2 : {return "Two";}
            case 3 : {return "Three";}
            case 4 : {return "Four";}
            case 5 : {return "Five";}
            case 6 : {return "Six";}
            case 7 : {return "Seven";}
            case 8 : {return "Eight";}
            case 9 : {return "Nine";}
        }
        return "";
    }
    public static void task29(BufferedReader reader) {
        System.out.println("When provided with a number between 0-9, return it in words.");


        try {

            System.out.println("Set parameter value1 from 1 to 9:");
            int x = Integer.parseInt(reader.readLine());
            System.out.println("Answer: Input :: " + x  + ", Output :: \"" + switchItUp(x)+"\"");

        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
