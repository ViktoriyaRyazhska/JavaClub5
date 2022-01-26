package javaclub5.mainClasses;

import java.io.BufferedReader;

import static javaclub5.mainClasses.MainProgram.selectTheme;

/**
 * Class for selection tasks from OOP theme
 *
 * @author Rostyslav Ros
 */
public final class OOPSelection {

    /**
     * Method for selection of the Task
     * @param reader BufferedReader
     */
    public static final void selectOOP(BufferedReader reader) {
        System.out.println("Select number of Task (1-4) \n 0. Main menu \n 12. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    System.out.println("Not done yet");
                    //javaclub5.oop.task1.Runner.start();
                    selectTheme(reader);
                    break;
                case 2:
                    javaclub5.oop.task2.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 3:
                    System.out.println("Not done yet");
                    //javaclub5.oop.task3.Runner.start();
                    selectTheme(reader);
                    break;
                case 4:
                    javaclub5.oop.task4.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 12:
                    break;
                default: {
                    System.out.println("Wrong input");
                    selectOOP(reader);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectOOP(reader);
        }
    }
}
