package main;

public class View {
    public static final String GREETINGS = "Hi there. We've a great menu for you.";
    public static final String WRONG_INPUT = "Please try again. You've made a input mistake \n" +
                                                          "I'll remind you. You must choose THE NUMBER \n";
    public static final String TRY_AGAIN = "Please choose the number from 1 to 72";
    public static final String SAY_GOOBYE = "It was a pleasure to serv you :) \n Have a great day!";

    public void printMessage(String message){
        System.out.println(message);
    }
}
