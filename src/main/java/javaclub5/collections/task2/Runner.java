package javaclub5.collections.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }
    public static void start(BufferedReader br)
    {
        try {
            System.out.println("Enter size of the list");
            int i = Integer.parseInt(br.readLine());
            if(i>0)
                System.out.println("Result: " + CreateList(i));
            else
                System.out.println("Wrong input");
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }
    }
    public static List CreateList(int number)
    {
        List listS= new ArrayList();

        for(int count = 1; count <= number;count++)
        {
            listS.add(count);
        }

        return listS;
    }
}
