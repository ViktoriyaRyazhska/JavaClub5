package javaclub5.OOP.task47;
import java.util.Arrays;

public class Task47 {
    public static Human[] create(){
        return new Human[]{new Man(), new Woman()};

    }
    public static void main(){
        System.out.println(Arrays.deepToString(create()));
    }




}

