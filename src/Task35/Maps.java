package Task35;

public class Maps {
    public static int[] map(int[] arr) {
        int [] doubledArr = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            doubledArr[i] = arr[i]*2;
        }
        return doubledArr;
    }
}