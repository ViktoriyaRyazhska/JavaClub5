package javaclub5.mainClasses;

import java.io.BufferedReader;

import static javaclub5.mainClasses.MainProgram.selectTheme;

/**
 * Class for selection tasks from Collections theme
 *
 * @author Rostyslav Ros
 */
public class CollectionSelection {
    /**
     * Method for selection of the Task
     * @param reader BufferedReader
     */
    public static void selectCollections(BufferedReader reader) {
        System.out.println("Select number of Task (1-4) \n 0. Main menu \n 12. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    System.out.println("Not done yet");
                    //javaclub5.collections.task1.Runner.start();
                    break;
                case 2:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task2.Runner.start(reader);
                    break;
                case 3:
                    javaclub5.collections.task3.Runner.start();
                    break;
                case 4:
                    System.out.println("Not done yet");
                    //javaclub5.collections.task4.Runner.start(reader);
                    break;
                case 12:
                    break;
                default:{
                    System.out.println("Wrong input");
                    selectCollections(reader);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectCollections(reader);
        }
    }
}
