package javaclub5.mainClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static javaclub5.mainClasses.BasicProgramSelection.selectBasicProgram;
import static javaclub5.mainClasses.ClassesSelection.selectClasses;
import static javaclub5.mainClasses.CollectionSelection.selectCollections;
import static javaclub5.mainClasses.ConditionSelection.selectConditions;
import static javaclub5.mainClasses.LoopsSelection.selectLoops;
import static javaclub5.mainClasses.OOPSelection.selectOOP;
import static javaclub5.mainClasses.StringSelection.selectStrings;

/**
 * Main app of project
 *
 * @author Rostyslav Ros
 */

public  final class MainProgram {
    public static void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        selectTheme(reader);

    }
    /**
     * Method for selection of the Theme
     * @param reader BufferedReader
     */
    public static void selectTheme(BufferedReader reader) {
        System.out.println("------------------------------");
        System.out.println("Select theme of the Tasks");
        System.out.println("1. Basic Program \n2. Classes \n3. Colections \n4. Conditions \n5. Loops \n" +
                "6. OOP \n7. Strings \n0. Exit ");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 1:
                    selectBasicProgram(reader);
                    break;
                case 2:
                    selectClasses(reader);
                    break;
                case 3:
                    selectCollections(reader);
                    break;
                case 4:
                    selectConditions(reader);
                    break;
                case 5:
                    selectLoops(reader);
                    break;
                case 6:
                    selectOOP(reader);
                    break;
                case 7:
                    selectStrings(reader);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong input");
                    selectTheme(reader);
                    break;
            }

        }
        catch (Exception e) {
            System.out.println("Wrong input");
            selectTheme(reader);
        }
    }
}
