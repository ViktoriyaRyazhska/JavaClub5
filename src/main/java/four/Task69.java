package four;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Task69 {
    public static List<String> push(String str){
        List<String> items = new ArrayList<>();
        items.add( str);
        return items;
    }

    public static void task69(BufferedReader reader) {
        System.out.println("You are trying to put a hash in ruby or an object " +
                "in javascript or java into an array, but it always returns error, " +
                "solve it and keep it as simple as possible!");


        try {
            System.out.println("Set Text  parameter String:exsample \"an object\"");
            String x = reader.readLine();
            push(x);
            System.out.println("Answer: (\""+x+"\") in array !");

        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
