package three;

// Task58. Triple Trouble
public class Task58 {

    public static String tripleTrouble(String one, String two, String three) {
        String[][] isa = new String[3][];
        StringBuilder sb = new StringBuilder("");

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
}