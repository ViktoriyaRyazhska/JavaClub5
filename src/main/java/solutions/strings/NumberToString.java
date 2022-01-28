package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

public class NumberToString implements Executable {
    @Override
    public void execute() {
        System.out.println("Function that can transform a number into a string.");
        int i = Helper.getInt(2000000000);
        String s = numToString(i);
        System.out.println(s);
    }

    public String numToString(int i) {
        return String.valueOf(i);
    }
}
