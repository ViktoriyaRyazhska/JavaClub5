package three;


import java.io.BufferedReader;

public class Task63{

    public static String abbrevName(String name) {
        String[] arr = name.split(" ");
        return Character.toUpperCase(arr[0].charAt(0))
                + "."
                + Character.toUpperCase(arr[1].charAt(0));
    }

    public static void task63(BufferedReader reader) {
        System.out.println("The task is to write a function to convert a name into initials. Two words with one space in between them.");
        try {
            System.out.println("Enter two words with one space in between them: ");
            String name = reader.readLine();
            System.out.println(abbrevName(name));
        } catch (Exception e) {
            System.out.println("Wrong input!..");
        }
    }
}
