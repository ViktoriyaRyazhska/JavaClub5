package two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task72 {

    public static HashMap Dictionary(String name) {
        HashMap<String, String> typeAndLocation = new HashMap<>();
        typeAndLocation.put("Apple", "A fruit that grows on trees");
        typeAndLocation.put("Pear", "A fruit that grows on trees");
        typeAndLocation.put("Peach", "A fruit that grows on trees");
        typeAndLocation.put("Plum", "A fruit that grows on trees");
        typeAndLocation.put("Orange", "A fruit that grows on trees");
        typeAndLocation.put("Coconut", "A fruit that grows on palms");
        return  typeAndLocation;
    }

    public static void task72( BufferedReader reader) {
        System.out.println("Interactive dictionary");
        try {
            System.out.println("Enter type of fruit");
            String name = reader.readLine();

            StringBuilder encode = new StringBuilder();
            String get = (String) Dictionary(name).get(name);
            if (get != null) {
                encode.append(get);
                System.out.println(encode);
            }else{
                System.out.println("Can't find entry for " + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
