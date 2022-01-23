package solutions.strings;

import solutions.Executable;

import java.util.Scanner;

public class ParseInt implements Executable {
    public static int howOld(final String herOld) {
        char c = herOld.charAt(0);
        return Integer.parseInt(String.valueOf(c));
        //your code here, return correct age as int ; )

    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(!str.matches("[0-9] year[s] old")) throw new IllegalArgumentException();
        System.out.println(howOld(str));
    }
}
