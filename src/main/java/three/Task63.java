package three;

//Task53. Abbreviate a Two Word Name
public class Task53 {

    public static String abbrevName(String name) {
        String[] arr = name.split(" ");
        String s = Character.toUpperCase(arr[0].charAt(0))
                + "."
                + Character.toUpperCase(arr[1].charAt(0));
//     for (int i = 0; i < arr.length; i++) {
//       String s = Character.toUpperCase(arr[i].charAt(0));
//     }
        return s;
    }
}