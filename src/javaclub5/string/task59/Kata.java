package javaclub5.string.task59;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 23:22
 */
public class Kata {
    public static String position(char alphabet){
        int numericValue = Character.getNumericValue(alphabet);
        if (numericValue <10 || numericValue>35) throw  new IllegalArgumentException("Only characters a-z");
        return "Position of alphabet: "+ (numericValue-10+1);
    }
}
