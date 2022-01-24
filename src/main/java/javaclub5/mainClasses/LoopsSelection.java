package javaclub5.mainClasses;

import java.io.BufferedReader;

import static javaclub5.mainClasses.MainProgram.selectTheme;

public class LoopsSelection {
    public static void selectLoops(BufferedReader reader) {
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
                    break;
                case 14:
                    javaclub5.loops.task14.Runner.start(reader);
                    break;
                case 15:
                    javaclub5.loops.task15.Runner.start(reader);
                    break;
                case 16:
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
