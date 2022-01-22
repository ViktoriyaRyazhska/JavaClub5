package four;

import java.io.BufferedReader;

public class Task24 {
    public static Integer basicMath(String op, int v1, int v2){
        if(op.equals("+")){
            return v1+v2;
        }
        if(op.equals("-")){
            return v1-v2;
        }
        if(op.equals("*")){
            return v1*v2;
        }
        if(op.equals("/")){
            return v1/v2;
        }

        return 0;
    }
    public static void task24(BufferedReader reader) {
        System.out.println("Your task is to create a function that does four basic mathematical operations.");


            try {
                System.out.println("Set operation( + or - or * or / ): ");
                String n = reader.readLine();
                System.out.println("Set parameter value1:");
                int x = Integer.parseInt(reader.readLine());
                System.out.println("Set parameter value2:");
                int y = Integer.parseInt(reader.readLine());
                System.out.println("Answer: ( \'" + n + "\' " + x + ", " + y + ") --> " + basicMath(n, x, y));

            } catch (Exception e) {
                System.out.println("Invalid parameter!");
            }
        }




    }

