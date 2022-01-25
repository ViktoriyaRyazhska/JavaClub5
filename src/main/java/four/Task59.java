package four;

import java.io.BufferedReader;
import java.util.Locale;

public class Task59 {
    public static String position(char alphabet) {
        //int alphabet_new=alphabet;
        String [] abc={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        String alphabet_new=Character.toString(alphabet).toUpperCase();
        for (int i = 0; i <abc.length ; i++) {
            if(alphabet_new.equals(abc[i])){
                String str = Integer. toString(i+1);
                return "Position of alphabet: "+str;
            }

        }
        return "";
    }

    public static void task59(BufferedReader reader) {
        System.out.println("When provided with a letter, return its position in the alphabet.");


        try {
            System.out.println("Enter a letter from the alphabet ");
            char x =reader.readLine().charAt(0);
            System.out.println("Answer: Input :: "+x+" is --> " +position(x));

        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}

