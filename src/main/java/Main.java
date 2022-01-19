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
            if(taskNumber < 1 && taskNumber > 72) throw new IOException();
        } catch (IOException exception) {
            System.out.println("Number incorrect!");
        }
        switch (taskNumber) {
            case 1: Task01.task1(); break;

            case 6: Task06.task6(); break;
        }
        Task01.task1();
    }
}
