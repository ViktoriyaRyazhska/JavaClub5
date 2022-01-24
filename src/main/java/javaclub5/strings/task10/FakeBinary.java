package javaclub5.strings.task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
 * Return the resulting string.
 *
 * @author Dmytro Prudius
 */

public class FakeBinary {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("Enter string: ");
        try {
            String str = br.readLine();
            System.out.println("Result: " + fakeBin(str));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[1-4]", "0").replaceAll("[^0]", "1");
    }
}
