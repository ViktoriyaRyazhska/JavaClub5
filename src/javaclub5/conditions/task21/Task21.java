package javaclub5.conditions.task21;

public class Task21 {
    /*
    It's bonus time in the big city! The fatcats are rubbing their paws in anticipation...
    but who is going to make the most money?

    Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.

    If bonus is true, the salary should be multiplied by 10. If bonus is false,
    the fatcat did not make enough money and must receive only his stated salary.
    */

    public static void main() {
        System.out.println("Salary 25000 + bonus:" + Kata.bonusTime(25000, true));
        System.out.println("Salary 1000         :" +Kata.bonusTime(1000, false));
        System.out.println("Salary 15000        :" +Kata.bonusTime(15000, false));
    }
}
