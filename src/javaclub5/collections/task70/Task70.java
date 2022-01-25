package javaclub5.collections.task70;

/**
 * Created by Sergiy Zapadenko on 25.01.2022 9:03
 */
public class Task70 {
    //Unfinished Loop - Bug Fixing #1
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        System.out.println("Collection, Task70.");
        System.out.println("Task was about Bug Fixing #1 - Unfinished Loop");
        System.out.println("for (int count = 1; count <= number; count++) {");
        System.out.println("    list.add(count);                    |_____________missing parameter was added.");
        System.out.println("}");
        Kata k = new Kata();
        k.CreateList(5);
    }

}
