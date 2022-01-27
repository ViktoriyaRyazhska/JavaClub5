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

    public static ArrayList<String> create(String man, String woman) {
        if (humans == null) {
            humans = new ArrayList<>();
            humans.add(String.valueOf(new Man(man)));
            humans.add(String.valueOf(new Woman(woman)));
        } else {
            humans.add(new Man(man).toString());
            humans.add(new Woman(woman).toString());
        }
        return humans;
    }
}
class Human {
    protected String name;
    public Human(String name) {
        this.name = name;
    }
}

class Man extends Human {
    public Man(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Man`s name: " + name;
    }
}

class Woman extends Human {
    public Woman(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Woman`s name: " + name;
    }
}

