package javaclub5.string.task66;

/**
 * Created by Sergiy Zapadenko on 25.01.2022 9:40
 */
public class Correct {

    public static String correct(String string) {
        if(string ==null || string.isEmpty()) throw new NullPointerException();
        string = string.replaceAll("5", "S"); //5->S
        string = string.replaceAll("0", "O"); //0->O
        string = string.replaceAll("1", "I"); //1->I
        return string;
    }
}
