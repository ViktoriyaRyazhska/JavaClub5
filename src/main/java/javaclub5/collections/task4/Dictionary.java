package javaclub5.collections.task4;

import java.io.BufferedReader;
import java.util.HashMap;


/**
 * In this kata, your job is to create a class Dictionary which you can add words to and their entries.
 *
 * @author Dmytro Prudius
 */

public class Dictionary {
    public static void start(BufferedReader br) {
        System.out.println("Enter the word: ");
        Dictionary d = new Dictionary();
        d.newEntry(d.look("Apple"),"A fruit that grows on trees");
        d.look("Banana");

    }
    private final HashMap<String, String> map;

    public Dictionary() {
        map = new HashMap<>();
    }

    public void newEntry(String key, String value) {
        map.put(key, value);
    }

    public String look(String key) {
        return map.getOrDefault(key, "Cant find entry for " + key);
    }
}
