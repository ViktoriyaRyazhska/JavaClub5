package three;

// Task68. Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right
public class Task38 {

    public static String remove(String s, int n){
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder("");
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("!") && counter < n) {
                counter++;
                continue;
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}