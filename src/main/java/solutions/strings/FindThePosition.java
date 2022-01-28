package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

public class FindThePosition implements Executable {
    public String position(char alphabet)
    {
        if (((int) alphabet - 96) > 0 && ((int) alphabet - 96)<=26)
        return "Position of alphabet: " + ((int) alphabet - 96);
        else return "Wrong Input";
    }

    @Override
    public void execute() {
        System.out.println("Return the number of char in alphabet:");
        char a = Helper.getLetter();
        System.out.println("Position is: " + position(Character.toLowerCase(a)));
    }
}
