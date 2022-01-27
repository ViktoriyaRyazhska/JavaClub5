package javaclub5.mainClasses;

import java.io.BufferedReader;
import java.io.IOException;


import static javaclub5.mainClasses.MainProgram.selectTheme;

/**
 * Class for selection tasks from Basic Programs theme
 *
 * @author Rostyslav Ros
 */
public final class BasicProgramSelection {

    /**
     * Method for selection of the Task
     * @param reader BufferedReader
     */
    public static void selectBasicProgram(BufferedReader reader) {
        System.out.println("Select number of Task (1-11) \n 0. Main menu \n 12. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    javaclub5.basicprogram.task1.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 2:
                    javaclub5.basicprogram.task2.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 3:
                    javaclub5.basicprogram.task3.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 4:
                    javaclub5.basicprogram.task4.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 5:
                    javaclub5.basicprogram.task5.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 6:
                    javaclub5.basicprogram.task6.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 7:
                    javaclub5.basicprogram.task7.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 8:
                    javaclub5.basicprogram.task8.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 9:
                    javaclub5.basicprogram.task9.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 10:
                    javaclub5.basicprogram.task10.Runner.start(reader);
                    goToMainMenu(reader);
                    break;
                case 11:
                    javaclub5.basicprogram.task11.GrassHopper.start(reader);
                    goToMainMenu(reader);
                    break;
                case 12:
                    break;
                default: {
                    System.out.println("Wrong input");
                    selectBasicProgram(reader);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectTheme(reader);
        }
    }

    private static void goToMainMenu(BufferedReader reader) throws IOException {
        System.out.println("---------------------");
        System.out.println("Press Enter");
        reader.readLine();
        selectTheme(reader);
    }
}
