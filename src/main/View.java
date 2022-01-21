package main;

public class View {
    public static final String INPUT_INT = "Hi there. We've a great manu for you \n " +
                                                           "Please choose the number from 1 to 72";
    public static final String WRONG_INPUT = "Please try again. You've made a input mistake \n" +
                                                          "I'll remind you. You must choose THE NUMBER";
    public static final String TRY_AGAIN = "Please choose the number from 1 to 72";
    public static final String WINNER = "";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }
}
