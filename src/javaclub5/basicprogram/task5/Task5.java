package javaclub5.basicprogram.task5;

public class Task5 {
    /*
     * Jenny has written a function that returns a greeting for a user.
     * However, she's in love with Johnny, and would like to greet him slightly different.
     * She added a special case to her function, but she made a mistake.
     * */
    public static void main(String[] args) {
        System.out.println(greet("Johnny"));
        System.out.println(greet("Sem"));
    }

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }
}
