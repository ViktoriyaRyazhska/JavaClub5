package two;

import java.io.BufferedReader;
import java.io.IOException;

public class Task22 {
    public static String  calculateAge( int yearOfBirth, int year) {
        int age = year - yearOfBirth;

            if (age >1) {
                return "You are " + age + " years old.";
            } else if (age==0) {
                return "You were born this very year!";
            } else if (age<-1){
                return "You will be born in " + Math.abs(age) + " years.";
            }
            else if (age==-1){
                return "You will be born in 1 year.";
            }
            else {
                return "You were born 1 year ago.";
            }
    }
     public static void task22(BufferedReader reader){
         System.out.println("How old are you?");
         try{
             System.out.println("Enter your birthday");
             int yearOfBirth = Integer.parseInt(reader.readLine());

             if (yearOfBirth > 0 &&  String.valueOf(Math.abs(yearOfBirth)).length()==4){
             System.out.println("Enter question year");}
             else {
                 System.out.println("Invalid value");
             }
             int currentYear = Integer.parseInt(reader.readLine());

             if (currentYear > 0 &&  String.valueOf(Math.abs(currentYear)).length()==4){
                 System.out.println(calculateAge( yearOfBirth, currentYear));
             }
             else {
                 System.out.println("Invalid value");
             }

         } catch (IOException e) {
             e.printStackTrace();
         }
     }


}
