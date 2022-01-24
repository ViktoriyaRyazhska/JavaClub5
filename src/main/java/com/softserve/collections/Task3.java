package main.java.com.softserve.collections;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start3TaskCollections;

public class Task3 extends ReadConsole {
    public static void main(String[] args) throws IOException {
        int digits = 0;
        List<Integer> listOfNumbers = new ArrayList<>();
        start3TaskCollections();
        try {
            digits = Integer.parseInt(br.readLine());
        } catch (IOException |NumberFormatException exception) {
            exception.printStackTrace();
        }
        for (int i = 0; i < digits ; i++) {
            System.out.println("Enter "+(i+1)+" number");
            listOfNumbers.add(Integer.parseInt(br.readLine()));
        }
        System.out.println("Now we will return only odd numbers =)");

        System.out.println("Result :"+ filterOddNumber(listOfNumbers));

        backToMenuOrRetry();

        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                case "2":
                    Task3.main(args);
                    break;
                default:
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task3.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = 0; i < listOfNumbers.size(); i++)
        {
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
                --i;
            }
        }
        return listOfNumbers;
    }

}
