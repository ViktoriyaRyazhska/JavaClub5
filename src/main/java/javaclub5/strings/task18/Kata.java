package javaclub5.strings.task18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Remove n exclamation marks in the sentence from left to right. n is positive integer.
 * Examples
 *
 * remove("Hi!",1) === "Hi"
 * remove("Hi!",100) === "Hi"
 * remove("Hi!!!",1) === "Hi!!"
 * remove("Hi!!!",100) === "Hi"
 * remove("!Hi",1) === "Hi"
 * remove("!Hi!",1) === "Hi!"
 * remove("!Hi!",100) === "Hi"
 * remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
 * remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
 * remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
 * remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"
 *
 * @author Rostyslav Ros
 */
public class Kata {

    /**
     *
     * @param s sentence
     * @param n exclamation marks in the sentence from left to right
     * @return Sentence without n exclamation marks in the sentence from left to right
     */
    public static String remove(String s, int n) {
        if (n == 0) {
            return s;
        }
        if(n<0){
            return s + " Need to input remove amount more than 0. Can't input less than 0.";
        }
        String pattern = "!";
        String text = s;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            s = s.replaceFirst("!", "");
            n--;
            if (n == 0) {
                break;
            }
        }
        return s;
    }

    /**
     * Main method of class
     * @param reader BufferedReade
     */
    public static void start(BufferedReader reader) {
        System.out.println("Input sentence to remove \"!\"");
        try {
            String sentence = reader.readLine();
            System.out.println("Input, how many \"!\" you want to remove");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("The result will be:");
            System.out.println(remove(sentence, n));
        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }
}
