package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

public class FindThePosition implements Executable {
    public static String position(char alphabet)
    {
        return "Position of alphabet: " + ((int) alphabet - 96);
    }

    @Override
    public void execute() {
        System.out.println("Return the number of char in alphabet:");
        char a = Helper.getLetter();
        System.out.println("Position is: " + position(Character.toLowerCase(a)));
    }
}
