import five.Task05;
import one.*;
import two.Task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        System.out.println("Select task (1-72):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int taskNumber = 1;
        try {
            taskNumber = Integer.parseInt(reader.readLine());
            if(taskNumber < 1 || taskNumber > 72) throw new IOException();
        } catch (IOException exception) {
            System.out.println("Number incorrect!");
        }
        switch (taskNumber) {
            case 1 -> Task01.task01();
            case 2 -> Task02.task02();
            case 5 -> Task05.task05();
            case 6 -> Task06.task06();
            case 11 -> Task11.task11();
            case 16 -> Task16.task16();
            case 21 -> Task21.task21();
            case 26 -> Task26.task26();
            case 31 -> Task31.task31();
            case 36 -> Task36.task36();
            case 41 -> Task41.task41();
            case 46 -> Task46.task46();
            case 51 -> Task51.task51();
            case 56 -> Task56.task56();
            case 61 -> Task61.task61();
            case 66 -> Task66.task66();
            case 71 -> Task71.task71();
        }
    }
}
