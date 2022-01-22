package solutions.strings;

import java.util.Arrays;

public class AbbreviateATwoWordName {

    public static String abbrevName(String name) {
        String[] initials = name.split(" ");
        name = String.valueOf(Character.toUpperCase(initials[0].charAt(0))) + "." +
                String.valueOf(Character.toUpperCase(initials[1].charAt(0)));
        return name;
    }
}
