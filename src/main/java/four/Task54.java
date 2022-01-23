package four;

import java.io.BufferedReader;

public class Task54 {
    public static int opposite(int number)
    {
        if (number < 0){
            number = Math.abs(number);
        }else{
            number = -(number);
        }
        return number;
    }
    public static void task54(BufferedReader reader) {
        System.out.println(" Given an integer or a floating-point number, find its opposite.");


        try {
            System.out.println("Set int  parameter value:");
            int x = Integer.parseInt(reader.readLine());
            System.out.println("Answer: opposite "+x+" is --> " +opposite(x));

        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
    }

