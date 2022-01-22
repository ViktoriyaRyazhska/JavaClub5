package four;

import java.io.BufferedReader;

public class Task19 {
    public static boolean isDivisible(long n, long x, long y) {
        if(n%x==0){
            if (n%y==0){
                return true;
            }else{
                return false;
            }
        }return false;
    }
    public static void task19(BufferedReader reader) {
        System.out.println("Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits.");
        try {
            System.out.println("Set parameter value1:");
            long n = Long.parseLong(reader.readLine());
            System.out.println("Set parameter value2:");
            long x = Long.parseLong(reader.readLine());
            System.out.println("Set parameter value3:");
            long y = Long.parseLong(reader.readLine());
            System.out.println("Answer: "+n+" divisible by "+x+" and "+y+" is--> "+ isDivisible(n,x,y));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}