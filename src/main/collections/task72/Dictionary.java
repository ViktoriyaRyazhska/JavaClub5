package main.collections.task72;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);
    private HashMap<String, String> map;

    public Dictionary() {
        map = new HashMap<>();
    }

    public void newEntry(String key, String value) {
        map.put(key, value);
    }

    public String look(String key) {
        return map.getOrDefault(key, "Cant find entry for " + key);
    }

    @Override
    public void execute() {
        Dictionary d = new Dictionary();
        System.out.println("Implement a class 'Dictionary' which you can add words to and their entries.");
        System.out.println("You must enter add words to and their entries. ");
        System.out.println("Lets enter a word: ");
        try {
            String word = scan.nextLine();
            System.out.println("Lets enter entries: ");
            String entries = scan.nextLine();
            System.out.println(d.look(word));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}