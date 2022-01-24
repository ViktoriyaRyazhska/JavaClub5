package four;

import java.io.BufferedReader;
import java.util.Arrays;

public class Task64 {
    public static int strCount(String str, char letter) {
      int count=0;
//        String new_letter=Character.toString(letter);
//        String [] new_str= str.substring(1, str.length() - 1).split(", ");
//        for (int i = 0; i < new_str.length ; i++) {
//            if(new_letter.equals(new_str[i])){
//                count++;
//            }else{
//               return count;
//            }
//
//        }

        char[] result = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if(letter==result[i]) {
                count++;

            }
        }
        return count;
    }
    public static void task64(BufferedReader reader) {
        System.out.println("Create a function that accepts 2 string arguments and " +
                "returns an integer of the count of occurrences the 2nd argument " +
                "is found in the first one.");


        try {
            System.out.println("Set Text  parameter String:");
            String x = reader.readLine();
            System.out.println("set  the desired letter  ");
            char y =reader.readLine().charAt(0);
            System.out.println("Answer: (\""+x+"\" , \""+y+"\")  ==> "+strCount(x,y));

        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
