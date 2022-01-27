package javaclub5.loops.task11;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Twice as old
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static int TwiceAsOld(int a, int b){
        return Math.abs((a*2)-b);

    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }
    public static void start(BufferedReader br) {
        System.out.println("Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).");
        try {
            System.out.println("Enter current father's age: ");
            int b = Integer.parseInt(br.readLine());
            System.out.println("current age of his son: ");
            int a = Integer.parseInt(br.readLine());
            System.out.println(TwiceAsOld(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
