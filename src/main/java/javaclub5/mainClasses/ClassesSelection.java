package javaclub5.mainClasses;

import java.io.BufferedReader;

import static javaclub5.mainClasses.MainProgram.selectTheme;

/**
 * Class for selection tasks from Classes theme
 *
 * @author Rostyslav Ros
 */
public final class ClassesSelection {
    /**
     * Method for selection of the Task
     * @param reader BufferedReader
     */
    public static final void selectClasses(BufferedReader reader) {
        System.out.println("Select number of Task (1-6) \n 0. Main menu \n 12. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    javaclub5.classes.task1.Runner.start();
                    selectTheme(reader);
                    break;
                case 2:
                    javaclub5.classes.task2.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 3:
                    javaclub5.classes.task3.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 4:
                    javaclub5.classes.task4.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 5:
                    System.out.println("Not done yet");
                    //javaclub5.classes.task5.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 6:
                    System.out.println("Not done yet");
                    //javaclub5.classes.task6.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 12:
                    break;
                default: {
                    System.out.println("Wrong input");
                    selectClasses(reader);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectClasses(reader);
        }

    }
}
