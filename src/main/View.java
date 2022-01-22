package main;

public class View {
    Topics topics;

    public static final String GREETINGS = "Hi there. We've a great menu for you.";
    public static final String WRONG_INPUT = "Please try again. You've made a input mistake \n" +
                                                          "I'll remind you. You must choose THE NUMBER \n";
    public static final String TRY_AGAIN = "Please choose the number from 1 to 72";
    public static final String TOPIC = "Please make a decision and select a topic.";
    public static final String CHOICE = "Your number is: ";
    public static final String JUST_MESSAGE = "Here you go...Waiting...";
    public static final String OUT = "Out of border! Please try again!";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndSomething(String message, int value){
        System.out.println(message + value);
    }

    public final void getTopics(){
        topics = new Topics();
        topics.getMenu();
    }
}
