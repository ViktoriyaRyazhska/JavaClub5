package javaclub5.mainClasses;

import java.io.BufferedReader;

import static javaclub5.mainClasses.MainProgram.selectTheme;

/**
 * Class for selection tasks from Condition theme
 *
 * @author Rostyslav Ros
 */
public final class ConditionSelection {
    /**
     * Method for selection of the Task
     * @param reader BufferedReader
     */
    public static void selectConditions(BufferedReader reader) {
        System.out.println("Select number of Task (1-14) \n 0. Main menu \n 15. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    javaclub5.conditions.task1.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 2:
                    javaclub5.conditions.task2.DivisibleNb.start(reader);
                    selectTheme(reader);
                    break;
                case 3:
                    javaclub5.conditions.task3.BooleanToString.start(reader);
                    selectTheme(reader);
                    break;
                case 4:
                    javaclub5.conditions.task4.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 5:
                    javaclub5.conditions.task5.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 6:
                    javaclub5.conditions.task6.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 7:
                    javaclub5.conditions.task7.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 8:
                    javaclub5.conditions.task8.OppositesAttract.start(reader);
                    selectTheme(reader);
                    break;
                case 9:
                    javaclub5.conditions.task9.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 10:
                    javaclub5.conditions.task10.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 11:
                    javaclub5.conditions.task11.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 12:
                    javaclub5.conditions.task12.Runner.start(reader);
                    selectTheme(reader);
                    break;
                case 13:
                    javaclub5.conditions.task13.Runner.TrafficLights.start(reader);
                    selectTheme(reader);
                case 14:
                    javaclub5.conditions.task14.Runner.start(reader);
                    selectTheme(reader);
                case 15:
                    break;
                default:{
                    System.out.println("Wrong input");
                    selectConditions(reader);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectConditions(reader);
        }
    }
}
