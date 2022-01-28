package javaclub5.collections.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Push a hash/an object into array
 *
 * @author Mysakovych Maksym
 */

public class Runner {

    public static void start(BufferedReader reader) {
        System.out.println("In this task need to add string value.");
        System.out.println("This is the item pushed into the list: " + push());
    }

    public static List<String> push(){
        List<String> items = new ArrayList<>();
        items.add("an object");
        return items;
    }
}
