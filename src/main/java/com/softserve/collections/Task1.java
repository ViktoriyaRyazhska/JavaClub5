package main.java.com.softserve.collections;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start1TaskCollections;

public class Task1 extends ReadConsole {

    static List<String> items;

    public static void main(String[] args) {

        start1TaskCollections();
        System.out.println("Fixing a method that put hash into an array ... ");
        System.out.println("Print array (List<String> items): ");
        System.out.println("value: " + push());
        System.out.println("index: " + push().indexOf("an object"));
        System.out.println("Excellent!");

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task1.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task1.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> push() {
        items = new ArrayList<>();
        String obj = "an object";
        items.add(0, obj);
        return items;
    }

}
