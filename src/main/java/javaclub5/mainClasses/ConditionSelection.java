package javaclub5.mainClasses;

import java.io.BufferedReader;

import static javaclub5.mainClasses.MainProgram.selectTheme;

/**
 * Class for selection tasks from Condition theme
 *
 * @author Rostyslav Ros
 */
public class ConditionSelection {
    /**
     * Method for selecton of the Task
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
                    break;
                case 2:
                    javaclub5.conditions.task2.DivisibleNb.start(reader);
                    break;
                case 3:
                    javaclub5.conditions.task3.BooleanToString.start(reader);
                    break;
                case 4:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task4.Runner.start(reader);
                    break;
                case 5:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task5.Runner.start(reader);
                    break;
                case 6:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task6.Runner.start(reader);
                    break;
                case 7:
                    javaclub5.conditions.task7.Runner.start(reader);
                    break;
                case 8:
                    javaclub5.conditions.task8.OppositesAttract.start(reader);
                    break;
                case 9:
                    javaclub5.conditions.task9.Runner.start(reader);
                    break;
                case 10:
                    javaclub5.conditions.task10.Runner.start(reader);
                    break;
                case 11:
                    javaclub5.conditions.task11.Runner.start(reader);
                    break;
                case 12:
                    javaclub5.conditions.task12.Runner.start(reader);
                    break;
                case 13:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task13.Runner.start(reader);
                case 14:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task14.Runner.start(reader);
                case 15:
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectTheme(reader);
        }
    }
}
