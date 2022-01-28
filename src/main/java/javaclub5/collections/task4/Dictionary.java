package javaclub5.collections.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


/**
 * In this kata, your job is to create a class Dictionary which you can add words to and their entries.
 *
 * @author Dmytro Prudius
 */

public class Dictionary {
    public HashMap<String, String> map;

    public Dictionary() {
        this.map = new HashMap<>();
    }

    public static void start(BufferedReader br) {
        System.out.println("In this task, your job is to create a class Dictionary where you can check words to and their entries.");
        System.out.println("Enter the word: ");

        try {
            String word = br.readLine();
            Dictionary d = new Dictionary();
            d.newEntry("Apple", "A fruit that grows on trees");
            System.out.println(d.look(word));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void newEntry(String key, String value) {
        map.put(key.toLowerCase(), value);
    }

    public String look(String key) {
        return map.getOrDefault(key.toLowerCase(), "Cant find entry for " + key);
    }
}
