package two;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Task47 {
    private static ArrayList<String> humans = null;

    public static void task47(BufferedReader reader) {
        System.out.println("Adam and Eve");
        try{
            System.out.println("Type man's name");
            String man = reader.readLine();
            System.out.println("Type woman's name");
            String woman = reader.readLine();

            if ((Pattern.matches("[a-zA-Z]+", man)) && (Pattern.matches("[a-zA-Z]+", woman))){
                System.out.println(create(man, woman));
            }
            else{
                System.out.println("Invalid value");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> create(String man, String woman) {
        if (humans == null) {
            humans = new ArrayList<>();
            humans.add(String.valueOf(new Man()));
            humans.add(String.valueOf(new Woman()));
        }
        humans.add(man);
        humans.add(woman);
        return humans;
    }
}
class Human { }

class Man extends Human { }

class Woman extends Human { }

