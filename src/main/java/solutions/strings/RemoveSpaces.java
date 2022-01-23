package solutions.strings;

import solutions.Executable;

import java.util.Scanner;

public class RemoveSpaces implements Executable {
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(noSpace(str));
    }
}
