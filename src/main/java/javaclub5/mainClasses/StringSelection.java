package javaclub5.mainClasses;

import java.io.BufferedReader;

import static javaclub5.mainClasses.MainProgram.selectTheme;

public class StringSelection {
    public static void selectStrings(BufferedReader reader) {
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
                    javaclub5.strings.task10.FakeBinary.start(reader);
                    break;
                case 11:
                    javaclub5.strings.task11.CharProblem.start(reader);
                    break;
                case 12:
                    javaclub5.strings.task12.GrassHopper.start(reader);
                    break;
                case 13:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task13.Runner.start(reader);
                    break;
                case 14:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task14.Runner.start(reader);
                    break;
                case 15:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task15.Runner.start(reader);
                    break;
                case 16:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task16.Runner.start(reader);
                    break;
                case 17:
                    javaclub5.strings.task17.Runner.start(reader);
                    break;
                case 18:
                    System.out.println("Not done yet");
                    //javaclub5.strings.task18.Runner.start(reader);
                    break;
                case 19:
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
