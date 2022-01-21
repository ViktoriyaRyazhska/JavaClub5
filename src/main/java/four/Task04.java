package four;

public class Task04 {
    public static boolean isDivisible(int wallLength, int pixelSize) {
       double b=wallLength % pixelSize;
       if(b!=0){
        return   false;
       }
        return true;
}}
