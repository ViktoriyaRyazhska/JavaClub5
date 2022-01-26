package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class RemoveSpaces implements Executable {
    public static String noSpace(final String x) {
        if(x==null) throw new IllegalArgumentException("The array is null");

        return x.replaceAll(" ", "");
    }

    @Override
    public void execute() {
        String str = Helper.getLine();
        System.out.println(noSpace(str));
    }
}
