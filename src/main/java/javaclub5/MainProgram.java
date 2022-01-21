package javaclub5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main app of project
 *
 * @author Rostyslav Ros
 */

public class MainProgram {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        selectTheme(reader);

    }

    public static void selectTheme(BufferedReader reader) {
        System.out.println("Select theme of Tasks");
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
                    Colections(reader);
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

        } catch (Exception e) {
            System.out.println("Wrong input");
            selectTheme(reader);
            e.printStackTrace();
        }
    }

    private static void selectBasicProgram(BufferedReader reader) {
        System.out.println("Select number of Task (1-11) \n 0. Main menu \n 12. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
                switch (selection) {
                    case 0:
                        selectTheme(reader);
                        break;
                    case 1:
                        javaclub5.basicprogram.task1.Runner.start(reader);
                        break;
                    case 2:
                        javaclub5.basicprogram.task2.Runner.start(reader);
                        break;
                    case 3:
                        javaclub5.basicprogram.task3.Runner.start(reader);
                        break;
                    case 4:
                        javaclub5.basicprogram.task4.Runner.start(reader);
                        break;
                    case 5:
                        System.out.println("Not done yet");
                        //javaclub5.basicprogram.task5.Runner.start(reader);
                        break;
                    case 6:
                        System.out.println("Not done yet");
                        //javaclub5.basicprogram.task6.Runner.start(reader);
                        break;
                    case 7:
                        System.out.println("Not done yet");
                        //javaclub5.basicprogram.task7.Runner.start(reader);
                        break;
                    case 8:
                        System.out.println("Not done yet");
                        //javaclub5.basicprogram.task8.Runner.start(reader);
                        break;
                    case 9:
                        System.out.println("Not done yet");
                        //javaclub5.basicprogram.task9.Runner.start(reader);
                        break;
                    case 10:
                        System.out.println("Not done yet");
                        //javaclub5.basicprogram.task10.Runner.start(reader);
                        break;
                    case 11:
                        System.out.println("Not done yet");
                        //javaclub5.basicprogram.task11.Runner.start(reader);
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

    private static void selectClasses(BufferedReader reader) {
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

    private static void selectConditions(BufferedReader reader) {
        System.out.println("Select number of Task (1-14) \n 0. Main menu \n 15. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task1.Runner.start(reader);
                    break;
                case 2:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task2.Runner.start(reader);
                    break;
                case 3:
                    System.out.println("Not done yet");
                    //javaclub5.conditions.task3.Runner.start(reader);
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Colections(BufferedReader reader) {
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
                default:
                    System.out.println("Wrong input");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void selectLoops(BufferedReader reader) {
        System.out.println("Select number of Task (1-15) \n 0. Main menu \n 16. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task1.Runner.start(reader);
                    break;
                case 2:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task2.Runner.start(reader);
                    break;
                case 3:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task3.Runner.start(reader);
                    break;
                case 4:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task4.Runner.start(reader);
                    break;
                case 5:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task5.Runner.start(reader);
                    break;
                case 6:
                    javaclub5.loops.task6.Runner.start(reader);
                    break;
                case 7:
                    javaclub5.loops.task7.Runner.start(reader);
                    break;
                case 8:
                    javaclub5.loops.task8.Runner.start();
                    break;
                case 9:
                    javaclub5.loops.task9.Runner.start();
                    break;
                case 10:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task10.Runner.start(reader);
                    break;
                case 11:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task11.Runner.start(reader);
                    break;
                case 12:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task12.Runner.start(reader);
                    break;
                case 13:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task13.Runner.start(reader);
                case 14:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task14.Runner.start(reader);
                case 15:
                    System.out.println("Not done yet");
                    //javaclub5.loops.task15.Runner.start(reader);
                case 16:
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void selectOOP(BufferedReader reader) {
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
                    break;
                case 2:
                    System.out.println("Not done yet");
                    //javaclub5.oop.task2.Runner.start(reader);
                    break;
                case 3:
                    System.out.println("Not done yet");
                    //javaclub5.oop.task3.Runner.start();
                    break;
                case 4:
                    javaclub5.oop.task4.Runner.start(reader);
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

    private static void selectStrings(BufferedReader reader) {
        System.out.println("Select number of Task (1-18) \n 0. Main menu \n 19. exit");
        try {
            int selection = Integer.parseInt(reader.readLine());
            switch (selection) {
                case 0:
                    selectTheme(reader);
                    break;
                case 1:
                    javaclub5.strings.task1.Runner.start(reader);
                    break;
                case 2:
                    javaclub5.strings.task2.Runner.start(reader);
                    break;
                case 3:
                    javaclub5.strings.task3.Runner.start(reader);
                    break;
                case 4:
                    javaclub5.strings.task4.Runner.start(reader);
                    break;
                case 5:
                    javaclub5.strings.task5.Runner.start(reader);
                    break;
                case 6:
                    javaclub5.strings.task6.Runner.start(reader);
                    break;
                case 7:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task7.Runner.start(reader);
                    break;
                case 8:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task8.Runner.start();
                    break;
                case 9:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task9.Runner.start();
                    break;
                case 10:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task10.Runner.start(reader);
                    break;
                case 11:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task11.Runner.start(reader);
                    break;
                case 12:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task12.Runner.start(reader);
                    break;
                case 13:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task13.Runner.start(reader);
                case 14:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task14.Runner.start(reader);
                case 15:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task15.Runner.start(reader);
                case 16:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task16.Runner.start(reader);
                case 17:
                    System.out.println("Not done yet");
                    javaclub5.strings.task17.Runner.start(reader);
                case 18:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task18.Runner.start(reader);
                case 19:
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
