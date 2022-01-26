package javaclub5.OOP.task47;
import java.util.Arrays;
import java.util.Scanner;

public class Task47 {
    public static Human [] create(String manName, String womanName){
        return new Human[]{new Man(manName), new Woman(womanName)};

    }

    public static void main(Scanner sc)
    {

        try {
            System.out.println("Enter name of man");
            String x= sc.nextLine();
            System.out.println("Enter name of woman");
            String y= sc.nextLine();
            System.out.println(Arrays.deepToString(create(x,y)));

        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
    }
     class Human{
        private String name;

        public Human(String name) {
            this.name = name;
        }

         @Override
         public String toString() {
             return "Human{" +
                     "name='" + name + '\'' +
                     '}';
         }
     }
    class Man extends Human{

        public Man(String name) {
            super(name);
        }
    }
    class Woman extends Human{

        public Woman(String name) {
            super(name);
        }
    }


