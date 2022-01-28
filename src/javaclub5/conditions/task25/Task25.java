package javaclub5.conditions.task25;

public class Task25 {

    /*Timmy & Sarah think they are in love, but around where they live,
    they will only know once they pick a flower each.
    If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
    Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.*/

    public static boolean isLove(int fl1, int fl2) {
        return fl1 % 2 != fl2 % 2;
    }
}
