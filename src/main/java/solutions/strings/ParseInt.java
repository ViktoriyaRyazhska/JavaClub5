package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class ParseInt implements Executable {
    public static int howOld(final String herOld) {
        char c = herOld.charAt(0);
        if (!herOld.matches("[0-9] year[s] old")) throw new IllegalArgumentException();

        return Integer.parseInt(String.valueOf(c));
        //your code here, return correct age as int ; )

    }

    @Override
    public void execute() {
        String str = Helper.getLine();
        try {
            System.out.println(howOld(str));
        } catch (IllegalArgumentException e) {
            execute();
        }
    }
}
