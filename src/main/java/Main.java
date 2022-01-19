import one.*;

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
            case 1: Task01.task1(); break;

            case 6: Task06.task6(); break;

            case 11: Task11.task11(); break;

            case 16: Task16.task16(); break;

            case 21: Task21.task21(); break;

            case 26: Task26.task26(); break;

            case 31: Task31.task31(); break;

            case 36: Task36.task36(); break;

            case 41: Task41.task41(); break;

            case 46: Task46.task46(); break;
        }
    }
}
