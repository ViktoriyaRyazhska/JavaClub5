package three;

import java.io.BufferedReader;

public class Task58{

    public static String tripleTrouble(String one, String two, String three) {
        String[][] isa = new String[3][];
        StringBuilder sb = new StringBuilder();

        isa[0] = one.split("");
        isa[1] = two.split("");
        isa[2] = three.split("");

        for (int i = 0; i < isa[0].length; i++) {
            for (String[] el : isa) {
                sb.append(el[i]);
            }
        }
        return sb.toString();
    }

    public static void task58(BufferedReader reader) {
        System.out.println("The task is to create a function that will return a string that combines all of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other.");
        try {
            System.out.println("Enter three strings, separated by Enter key: ");
            String s1 = reader.readLine();
            String s2 = reader.readLine();
            String s3 = reader.readLine();
            System.out.println(tripleTrouble(s1, s2, s3));
        } catch (Exception e) {
            System.out.println("Wrong input!..");
        }
    }
}
