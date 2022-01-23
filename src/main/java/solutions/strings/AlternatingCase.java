package solutions.strings;

import solutions.Executable;

import java.util.Scanner;

public class AlternatingCase implements Executable {
    public static String toAlternativeString(String string) {
        // your code here!
        char[] arr = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(string.charAt(i));
            } else {
                arr[i] = Character.toLowerCase(string.charAt(i));
            }
        }
        return String.valueOf(arr);
    }

    @Override
    public void execute() {
        String str = new Scanner(System.in).nextLine();
        System.out.println(toAlternativeString(str));
    }
}
