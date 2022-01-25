package main;

public class View {
    public static final String GREETINGS = "Hi there. We've a great menu for you.";
    public static final String WRONG_INPUT = "Please try again. You've made a input mistake.";
    public static final String SAY_GOOBYE = "It was a pleasure to work with you :) \n Have a great day!";
    public static final String CONTINUE = "Do you want to continue?";
    public static final String YORN = "Please choose: Y / N";

    public void printMessage(String message){
        System.out.println(message);
    }
}
