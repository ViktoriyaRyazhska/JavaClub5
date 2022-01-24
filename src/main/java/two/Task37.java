package two;


import java.io.BufferedReader;
import java.util.ArrayList;

public class Task37 {
    public static ArrayList<Integer> mass (int n) {

        ArrayList<Integer> arr = new ArrayList();
        for (int i = -1; i < n; i++) {
            arr.add(0, i + 1);
        }
        return arr;
    }

    public static void task37(BufferedReader reader){
        System.out.println("Reversed-sequence");
        try {
            System.out.println("Enter number:");
           int n = Integer.parseInt(reader.readLine());
           System.out.println(mass(n));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
