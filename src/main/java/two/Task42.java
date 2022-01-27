package two;

import java.io.BufferedReader;
import java.io.IOException;

public class Task42 {
    public static int Older(int father, int son){
        return (father - son*2);
    }

    public static void task42(BufferedReader reader){
        System.out.println("Twice-as-old");
        try{
            System.out.println("Father's age");
            int father = Integer.parseInt(reader.readLine());
            System.out.println("Son's age");
            int son = Integer.parseInt(reader.readLine());

            if(Older(father,son)>0){
                System.out.println("It will be in " + Math.abs(Older(father,son)) + " years");
            }
            else if (Older(father,son)<0){
                System.out.println("It was " + Older(father,son) + " years ago");
            }
            else {
                System.out.println("It can't be");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
