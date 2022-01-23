package javaclub5.mainClasses;

import java.io.BufferedReader;
import java.io.IOException;

import static javaclub5.mainClasses.MainProgram.selectTheme;

public class ClassesSelection {
    public static void selectClasses(BufferedReader reader) {
        System.out.println("Select number of Task (1-6) \n 0. Main menu \n 12. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    javaclub5.classes.task1.Runner.start();
                    break;
                case 2:
                    javaclub5.classes.task2.Runner.start(reader);
                    break;
                case 3:
                    javaclub5.classes.task3.Runner.start(reader);
                    break;
                case 4:
                    System.out.println("Not done yet");
                    //javaclub5.classes.task4.Runner.start(reader);
                    break;
                case 5:
                    System.out.println("Not done yet");
                    //javaclub5.classes.task5.Runner.start(reader);
                    break;
                case 6:
                    System.out.println("Not done yet");
                    //javaclub5.classes.task6.Runner.start(reader);
                    break;
                case 12:
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
