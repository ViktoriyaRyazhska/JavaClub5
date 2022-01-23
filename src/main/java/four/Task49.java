package four;

import java.io.BufferedReader;

public class Task49 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public static String encode(String source){
        String a="";
               if(!(source.equals(a))){
                   source=source.replaceAll("A","4")
                           .replaceAll("a","4")
                           .replaceAll("E","3")
                           .replaceAll("e","3")
                           .replaceAll("L","1")
                           .replaceAll("l","1")
                           .replaceAll("M","/^^\\")
                           .replaceAll("m","/^^\\")
                           .replaceAll("u","(_)")
                           .replaceAll("U","(_)")
                           .replaceAll("o","0")
                           .replaceAll("O","0");
            return source;
        }else {
        return "empty string";
    }
    }
    public static void task49(BufferedReader reader) {
        System.out.println("The objective of this Kata is to provide some way " +
                "to encode a string into its leetspeak version.");


        try {
            System.out.println("Set int  parameter String:");
            String x = reader.readLine();
            System.out.println("Answer: encode "+x+" is --> " +encode(x));

        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}

abstract class Encoder{
    public abstract String encode(String source) ;


}

