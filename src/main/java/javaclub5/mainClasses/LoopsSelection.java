package javaclub5.mainClasses;

import java.io.BufferedReader;
import java.io.IOException;

import static javaclub5.mainClasses.MainProgram.selectTheme;

/**
 * Class for selection tasks from Loops theme
 *
 * @author Rostyslav Ros
 */
public final class LoopsSelection {
    /**
     * Method for selection of the Task
     * @param reader BufferedReader
     */
    public static void selectLoops(BufferedReader reader) {
        System.out.println("Select number of Task (1-15) \n 0. Main menu \n 16. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    javaclub5.loops.task1.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 2:
                    javaclub5.loops.task2.Dinglemouse.start(reader);
                    goToMainMenu(reader);
                    break;
                case 3:
                    javaclub5.loops.task3.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 4:
                    javaclub5.loops.task4.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 5:
                    javaclub5.loops.task5.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 6:
                    javaclub5.loops.task6.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 7:
                    javaclub5.loops.task7.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 8:
                    javaclub5.loops.task8.Runner.start();
                    goToMainMenu(reader);
                    break;
                case 9:
                    javaclub5.loops.task9.Runner.start();
                    goToMainMenu(reader);
                    break;
                case 10:
                    javaclub5.loops.task10.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 11:
                    javaclub5.loops.task11.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 12:
                    javaclub5.loops.task12.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 13:
                    javaclub5.loops.task13.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 14:
                    javaclub5.loops.task14.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 15:
                    javaclub5.loops.task15.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 16:
                    break;
                default:{
                    System.out.println("Wrong input");
                    selectLoops(reader);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectLoops(reader);
        }
    }

    /**
     * Method to go to main menu
     * @param reader BufferedReader
     * @throws IOException
     */
    private static void goToMainMenu(BufferedReader reader) throws IOException {
        System.out.println("------------------------------");
        System.out.println("Press Enter");
        reader.readLine();
        selectTheme(reader);
    }
}
