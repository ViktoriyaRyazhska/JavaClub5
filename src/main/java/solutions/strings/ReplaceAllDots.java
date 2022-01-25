package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

public class ReplaceAllDots implements Executable {
    public static String replaceDots(final String str) {
        return str.replace(".", "-");
    }

    @Override
    public void execute() {
        System.out.println("Replace all dots to dashes.\nEnter string:");
        String line = Helper.getLine();
        System.out.println(replaceDots(line));
    }
}
